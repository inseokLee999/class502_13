package org.choongang.member.validators;


import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {
    private final MemberMapper memberMapper;

    @Override
    public boolean supports(Class<?> clazz) {//RequestJoin 커맨드 객체만 검증 하도록 제한
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /*
         * 1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
         * 2. email 중복 여부
         * 3. 비밀 번호 자리수 체크(8자리)
         * 4. 비밀 번호, 비밀 번호 확인 일치 여부
         *
         * */
        RequestJoin form = (RequestJoin) target;
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean agree = form.isAgree();

        //필수 항목 체크
        /*if(!StringUtils.hasText(email)){ //blank, null 체크
            errors.rejectValue("email", "Required","이메일을 입력하세요.");
        }
        if(!StringUtils.hasText(password)){
            errors.rejectValue("password","Required","비밀번호를 입력하세요.");
        }*/
        /*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required", "이메일을 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required", "비밀번호를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required", "비밀번호가 일치 하지 않습니다.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "Required", "회원명을 입력하세요.");
        if (!agree) {
            errors.rejectValue("agree", "Required", "회원가입 약관에 동의하세요");
        }*/
        //2. email 중복 여부
        if (StringUtils.hasText(email) && memberMapper.exists(email) != 0L) {
            errors.rejectValue("email", "Duplicated");
        }
        //3. 비밀 번호 자리수 체크(8자리)
        /*if (StringUtils.hasText(password) && password.length() < 8) {
            errors.rejectValue("password", "Length");
        }*/
        //4. 비밀 번호, 비밀 번호 확인 일치 여부
        if (StringUtils.hasText(password) && StringUtils.hasText(confirmPassword) && !password.equals(confirmPassword)) {
            errors.rejectValue("confirmPassword", "Mismatch");
        }
    }
/*
    @Override
    public void check(RequestJoin form) {
        *//*
     * 1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
     * 2. email 중복 여부
     * 3. 비밀 번호 자리수 체크(8자리)
     * 4. 비밀 번호, 비밀 번호 확인 일치 여부
     *
     * *//*
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        Boolean agree = form.isAgree();
//        1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
        checkRequired(email, new BadRequestException("이메일을 입력 하세요."));
        checkRequired(password, new BadRequestException("비밀 번호를 입력 하세요."));
        checkRequired(confirmPassword, new BadRequestException("비밀 번호 확인을 입력 하세요."));
        checkRequired(userName, new BadRequestException("사용자 이름를 입력 하세요."));
        checkTrue(agree, new BadRequestException("약관에 동의 하세요."));
//        2. email 중복 여부
        checkTrue(memberMapper.exists(email) == 0, new BadRequestException("이미 존재 하는 이메일 입니다."));
//        3. 비밀 번호 자리수 체크(8자리)
        checkTrue(password.length() >= 8, new BadRequestException("비밀번호를 8자리 이상 입력 하세요."));
//        4. 비밀 번호, 비밀 번호 확인 일치 여부
        checkTrue(password.equals(confirmPassword), new BadRequestException("비밀번호가 일치 하지 않습니다."));


    }*/
}
