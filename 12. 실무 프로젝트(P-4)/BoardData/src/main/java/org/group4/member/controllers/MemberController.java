package org.group4.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.group4.board.entities.Board;
import org.group4.board.repositories.BoardRepository;
import org.group4.global.exceptions.ExceptionProcessor;
import org.group4.member.MemberInfo;
import org.group4.member.MemberUtil;
import org.group4.member.services.MemberSaveService;
import org.group4.member.validators.JoinValidator;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@SessionAttributes("requestLogin")
public class MemberController implements ExceptionProcessor {

    private final JoinValidator joinValidator;
    private final MemberSaveService memberSaveService;
    private final MemberUtil memberUtil;
    private final BoardRepository boardRepository;

    @ModelAttribute
    public RequestLogin requestLogin() {
        return new RequestLogin();
    }

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form, Model model) {
        model.addAttribute("addCss", "join");
//        boolean result = false;
//        if(!result){
//            throw new AlertRedirectException("테스트 예외,","/mypage", HttpStatus.BAD_REQUEST);
//        }
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors, Model model) {
//        memberSaveService.save(form);
        model.addAttribute("addCss", "join");
        joinValidator.validate(form, errors);
        errors.getAllErrors().forEach(System.out::println);
        if (errors.hasErrors()) {
            return "member/join";
        }
        memberSaveService.save(form);
        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login(@Valid @ModelAttribute RequestLogin form, Errors errors, Model model) {
        model.addAttribute("addCss", "join");
        String code = form.getCode();
        if (StringUtils.hasText(code)) {
            errors.reject(code, form.getDefaultMessage());
            //비번이 만료인 경우 비번 재설정 페이지 이동
            if (code.equals("CredentialsExpired.Login")) {
                return "redirect:/member/password/reset ";
            }
        }
        return "member/login";
    }

}
