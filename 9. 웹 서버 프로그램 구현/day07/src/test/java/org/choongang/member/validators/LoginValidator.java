package org.choongang.member.validators;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.EmailValidator;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;

public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator, EmailValidator {
    private MemberMapper mapper;

    public LoginValidator(MemberMapper mapper) {
        this.mapper = mapper;
    }
    @Override
    public void check(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        //필수 항목 검증
        checkRequired(email,new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));

        //이메일로 회원이 등록되어 있는지 체크
        String message = "이메일 또는 비밀번호가 일치하지 않는데 뭐가 틀렸는지는 안알려줄거임ㅋㅋ.";
        Member member = mapper.get(email);
        checkTrue(member!=null,new BadRequestException(message));
        //비밀번호 일치 여부 체크
        checkTrue(BCrypt.checkpw(password,member.getPassword()),new BadRequestException(message));
        //세션에 회원 정보 유지
    }
}
