package tests;

import global.exception.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import member.validators.JoinValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {
    private JoinService joinService;
    @BeforeEach
    void init(){
        joinService = new JoinService(new JoinValidator());
    }

    RequestJoin getData() {
        return RequestJoin.builder()
                .email("test" + System.currentTimeMillis() + "@test.org")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자" + System.currentTimeMillis())
                .termsAgree(true)
                .build();
    }

    @Test
    @DisplayName("회원가입 성공시 예외가 발생 없음")
    void successTest(){
        assertDoesNotThrow(()->{
            joinService.process(getData());
        });
    }
    @Test @DisplayName("필수항목 검증(이메일, 비밀번호, 비밀번호 확인, 회원명) 검증, 검증 실패시, ValidationException 발생 ")
    void requiredFieldTest(){
        assertAll(
                //이메일 검증
                ()->{
                    RequestJoin form = getData();
                    form.setEmail(null);
                    requiredFieldEachTest(form,"이메일");

                    form.setEmail("    ");
                    requiredFieldEachTest(form,"이메일");
                },
                ()->{//비밀번호 검증
                    RequestJoin form = getData();
                    form.setPassword(null);
                    requiredFieldEachTest(form,"비밀번호");

                    form.setPassword("    ");
                    requiredFieldEachTest(form,"비밀번호");
                },
                ()->{//비밀번호확인 검증
                    RequestJoin form = getData();
                    form.setConfirmPassword(null);
                    requiredFieldEachTest(form,"비밀번호를 확인");

                    form.setConfirmPassword("    ");
                    requiredFieldEachTest(form,"비밀번호를 확인");
                },
                ()->{//회원 명 검증
                    RequestJoin form = getData();
                    form.setUserName(null);
                    requiredFieldEachTest(form,"회원명");

                    form.setUserName("    ");
                    requiredFieldEachTest(form,"회원명");
                },()->{//약관동의 검증
                    RequestJoin form = getData();
                    form.setTermsAgree(false);
                    requiredFieldEachTest(form,"약관에 동의");
                }
        );
//        RequestJoin form ;
        /*이메일 필수 검증 S*/
/*
        ValidationException thrown = assertThrows(ValidationException.class,()->{
            RequestJoin form = getData();
            //null체크
            form.setEmail(null);
            joinService.process(form);
            //빈 문자 체크
            form.setEmail("    ");
            joinService.process(form);
        });
        String message = thrown.getMessage();//발생한 예외 메세지
        assertTrue(message.contains("이메일"));
*/
        //이메일 필수 체크 - null , 빈 값
//        form = getData();
//        form.setEmail(null);
/*
        requiredFieldEachTest(form,"이메일");
        System.out.println("실행");
        form.setEmail("    ");
        requiredFieldEachTest(form,"이메일");
*/
        /*이메일 필수 검증 E*/

        /*비밀번호 필수 검증 S*/
/*
        ValidationException thrown = assertThrows(ValidationException.class,()->{
            RequestJoin form = getData();

            form.setPassword(null);
            joinService.process(form);
            form.setPassword("    ");
            joinService.process(form);
        });
        message = thrown.getMessage();
        System.out.println(message);
        assertTrue(message.contains("비밀번호"));
*/
/*
        form = getData();
        form.setPassword(null);
        requiredFieldEachTest(form,"비밀번호");
        form.setPassword("    ");
        requiredFieldEachTest(form,"비밀번호");
*/
        /*비밀번호 필수 검증 E*/
    }
    void requiredFieldEachTest(RequestJoin form,String keyword){
        ValidationException thrown = assertThrows(ValidationException.class,()->{
           joinService.process(form);
        },keyword+" 오류");
        String message = thrown.getMessage();
        assertTrue(message.contains(keyword));
    }
    @Test @DisplayName("비밀번호와 비밀번호 확인 일치 테스트, 검증 실패 시 ValidationException 발생")
    void passwordMatchTest(){
        RequestJoin form = getData();
//        form.setPassword("22345678");
        requiredFieldEachTest(form,"비밀번호가 일치");
    }
    @Test @DisplayName("이메일 중복 여부 테스트, 검증 실패 시 DuplicatedMemberException 발생")
    void duplicateEmailTest(){

    }
    @Test @DisplayName("회원 가입 완료 후 실제 데이터베이스에서 조회 되는지 검사")
    void memberExistsTest(){
        //가입 처리

        //getData() 로 생성한 데이터의 email항목으로 db 조회

        // 조회한 회원 데이터 email과 getData()로 생성한 email이 일치하는지 체크
        //assertEquals(...)
    }
}
