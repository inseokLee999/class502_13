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
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestLogin request = (RequestLogin) target;
        String email = request.getEmail();
        String password = request.getPassword();
        boolean saveEmail = request.isSaveEmail();
//        1) 필수항목검증(email,password) RequestLogin 에서 @NotBlank

        if (StringUtils.hasText(email)) {
            //2) email로 회원이 조회되는지
            Member member = memberMapper.get(email);
            if (member == null) {
                errors.reject("Check.emailPassword");
            }
            if (member != null && StringUtils.hasText(password) && !BCrypt.checkpw(password, member.getPassword())) {
                //3) 조회된 회원의 비밀번호가 입력한 값과 일치하는지 검증
                errors.reject("Check.emailPassword");
            }
        }


    }
}
