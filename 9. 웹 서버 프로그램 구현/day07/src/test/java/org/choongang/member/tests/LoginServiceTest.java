package org.choongang.member.tests;

import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.session.SqlSession;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.only;
@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {
    private LoginService loginService;
    private Faker faker;
    private RequestJoin form;
    private SqlSession dbsession;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpSession session;//테스트 환경에선 세션이 존재 할수 없기에..

    @BeforeEach
    void init(){
        loginService = MemberServiceProvider.getInstance().loginService();
        JoinService joinService = MemberServiceProvider.getInstance().joinService();
        faker = new Faker(Locale.ENGLISH);
        dbsession = MemberServiceProvider.getInstance().getSession();

        //회원 가입 -> 가입한 회원 정보로 email, password 스텁 생성
        form = RequestJoin.builder()
                .email(faker.internet().emailAddress())
                .password(faker.regexify("\\w{8,16}").toLowerCase())
                .userName(faker.name().fullName())
                .termsAgree(true)
                .build();
        form.setConfirmPassword(form.getPassword());

        joinService.process(form);
        setData();
        given(request.getSession()).willReturn(session);
    }
    void setData(){
        setParam("email", form.getEmail());
        setParam("password", form.getPassword());
    }
    void setParam(String name, String value){
        given(request.getParameter(name)).willReturn(value);//name 이 주어지면 value 값 반환
    }
    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest(){
        assertDoesNotThrow(()->{
            loginService.process(request);
        });
        //로그인 처리 완료시 HttpSession - setAttribute 메서드가 호출 됨
        then(session).should(only()).setAttribute(any(),any());
    }

    @Test@DisplayName("필수 입력 항목 검증(이메일, 비밀번호) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFieldTest(){
        assertAll(()->requiredEachFieldTest("email",false,"이메일"),
                ()->requiredEachFieldTest("email",true,"이메일"),
                ()->requiredEachFieldTest("password",false,"비밀번호"),
                ()->requiredEachFieldTest("password",true,"비밀번호"));
    }
    void requiredEachFieldTest(String name,boolean isNull, String message){
        setData();
        BadRequestException thrown = assertThrows(BadRequestException.class,()-> {
            if (name.equals("password")) {
                setParam("password", isNull ? null : "    ");
            } else {//이메일
                setParam("email", isNull ? null : "    ");
            }
            loginService.process(request);
        },name+"TEST");
        String msg = thrown.getMessage();
        assertTrue(msg.contains(message),name +"키워드 :" + message + "TEST");
    }
    @Test@DisplayName("이메일로 회원이 등록되어 있는지 검증, 검증 실패시 BadRequestException 발생")
    void memberExistTest(){
        //등록되어있지않은 이메일 -> BadRequestException
        setParam("email", "####"+form.getEmail());
        BadRequestException thrown = assertThrows(BadRequestException.class,()-> {
            loginService.process(request);
        });
        String message = thrown.getMessage();
        assertTrue(message.contains("이메일 또는 비밀번호"));
        //등록되어있는 정보
    }
    @Test@DisplayName("비밀번호 검증, 검증 실패시 BadRequestException")
    void passwordCheckTest(){
        setParam("password", "###"+form.getPassword());
        BadRequestException thrown = assertThrows(BadRequestException.class,()-> {
            loginService.process(request);
        });
        String message = thrown.getMessage();
        assertTrue(message.contains("이메일 또는 비밀번호"));
    }

    @AfterEach
    void destroy(){
//        dbsession.rollback();
    }
}
