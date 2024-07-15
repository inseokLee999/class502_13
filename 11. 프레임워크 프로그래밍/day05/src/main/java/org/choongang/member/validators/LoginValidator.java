package org.choongang.member.validators;


import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {
    private final MemberMapper memberMapper;

    @Override
    public boolean supports(Class<?> clazz) {//검증하려는 객체를 한정
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //Bean Validation 검증 실패 시에는 다음 검증을 진행 X
        if (errors.hasErrors()) {
            return;// controller 에서 값이 넘어올 때 이미 에러가 있으면 아래 코드 실행 x
        }
        RequestLogin form = (RequestLogin) target;
        String email = form.getEmail();
        String password = form.getPassword();
//        1) 필수항목검증(email,password)
//        2) email로 회원이 조회되는지
//        3) 조회된 회원의 비밀번호가 입력한 값과 일치하는지 검증
        if (StringUtils.hasText(email)) {//이런게 필요없어진다 errors.hasErrors()에서 필터링
            Member member = memberMapper.get(email);
            if (member == null) {
//                errors.rejectValue("email", "Fail.login");
                errors.reject("Check.emailPassword");
            }
            if (member != null && StringUtils.hasText(password) && !BCrypt.checkpw(password, member.getPassword())) {
                errors.reject("Check.emailPassword");
            }

        }
    }
}
