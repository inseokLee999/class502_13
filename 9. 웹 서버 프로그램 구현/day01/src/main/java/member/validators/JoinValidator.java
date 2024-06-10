package member.validators;

import global.exception.ValidationException;
import global.validators.RequiredValidator;
import global.validators.Validator;
import member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {
    @Override
    public void check(RequestJoin form) {
        /*필수 항목 검증 S*/
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean termsAgree = form.isTermsAgree();
        /*

        if(email==null||email.isBlank()){
            throw new ValidationException("이메일을 입력하세요");
        }

        if(password == null || password.isBlank()){
            throw new ValidationException("비밀번호를 입력하세요.");
        }

        if( confirmPassword == null || confirmPassword.isBlank()){
            throw new ValidationException("비밀번호를 확인하세요");
        }*/
        checkRequired(email,new ValidationException("이메일을 입력하세요"));
        checkRequired(password,new ValidationException("비밀번호를 입력하세요"));
        checkRequired(confirmPassword, new ValidationException("비밀번호를 확인하세요"));
        checkRequired(userName,new ValidationException("회원명을 입력하세요"));
        checkPasswordMatch(password,confirmPassword,new ValidationException("비밀번호가 일치 하지 않습니다"));
        checkTrue(termsAgree, new ValidationException("약관에 동의하세요"));
/*
        if(!termsAgree){
            throw new ValidationException("약관에 동의하세요.");
        }
*/
        /*필수 항목 검증 E*/

    }
}
