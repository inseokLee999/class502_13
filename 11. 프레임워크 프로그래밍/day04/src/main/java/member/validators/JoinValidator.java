package member.validators;

import global.exceptions.BadRequestException;
import global.validators.RequiredValidator;
import global.validators.Validator;
import lombok.RequiredArgsConstructor;
import mappers.member.MemberMapper;
import member.controllers.RequestJoin;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {
    private final MemberMapper memberMapper;

    @Override
    public void check(RequestJoin form) {
        /*
         * 1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
         * 2. email 중복 여부
         * 3. 비밀 번호 자리수 체크(8자리)
         * 4. 비밀 번호, 비밀 번호 확인 일치 여부
         *
         * */
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        Boolean agree = form.isAgree();
//        1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
        checkRequired(email, new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new BadRequestException("비밀번호 확인을 입력하세요."));
        checkRequired(userName, new BadRequestException("사용자 이름를 입력하세요."));
        checkTrue(agree, new BadRequestException("약관에 동의하세요."));
//        2. email 중복 여부
        checkTrue(memberMapper.exists(email) == 0, new BadRequestException("이미 존재하는 이메일입니다."));
//        3. 비밀 번호 자리수 체크(8자리)
        checkTrue(password.length() >= 8, new BadRequestException("비밀번호를 8자리 이상 입력하세요."));
//        4. 비밀 번호, 비밀 번호 확인 일치 여부
        checkTrue(password.equals(confirmPassword), new BadRequestException("비밀번호가 일치 하지 않습니다."));


    }
}
