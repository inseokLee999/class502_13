package exam01;

import com.github.javafaker.Faker;
import global.Mailer;
import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;
@ExtendWith(MockitoExtension.class)//모의 객체 생성
public class Ex02Test {
    private LoginService loginService;
    @Mock
    private Mailer mailer;
    private Faker faker;
    @Mock
    private HttpServletRequest request;
    @BeforeEach
    void init(){
        loginService = new LoginService(new LoginValidator());
//        mailer = mock(Mailer.class);
        faker = new Faker(Locale.FRENCH);
//        request = mock(HttpServletRequest.class);
        //stub 추가
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        given(request.getParameter("password")).willReturn(faker.regexify("\\w{8}").toLowerCase());
    }
    @Test
    void test1(){
        loginService.setMailer(mailer);
        loginService.process(request);
        String email = request.getParameter("email");
        then(mailer).should(only()).send(email);//send 함수가 loginService.process 메서드에서 단 한번 호출 되는지 테스트
    }
    @Test
    void test2(){
        loginService.setMailer(mailer);
        loginService.process(request);
        String email = request.getParameter("email");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        then(mailer).should().send(captor.capture());//내부에 발생한 인자를 capture (실제로 확인된 값을 확인)
        String usedEmail = captor.getValue();
        assertEquals(email, usedEmail);
    }
}
