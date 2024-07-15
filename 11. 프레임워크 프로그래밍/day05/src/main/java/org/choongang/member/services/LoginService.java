package org.choongang.member.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberMapper memberMapper;
    private final HttpSession session;
    private final HttpServletResponse response;

    public void process(String email) {
        /*
         *  1. email 로 회원 조회
         *  2. 세션에 회원 정보를 유지
         *  3.
         * */
        Member member = memberMapper.get(email);
        if (!StringUtils.hasText(email)) {
            return;
        }

        session.setAttribute("member", member);
    }

    public void process(RequestLogin form) {
        process(form.getEmail());
        /*이메일 기억하기 처리*/
        Cookie cookie = new Cookie("savedEmail", form.getEmail());
        if (form.isSaveEmail()) {
            cookie.setMaxAge(60 * 60 * 24 * 7);// 7일간 쿠키 유지
        } else {//쿠키 제거
            cookie.setMaxAge(0);
        }
        response.addCookie(cookie);
    }
}
