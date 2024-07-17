package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.entities.Member;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.LoginService;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final JoinValidator joinValidator;
    private final JoinService joinService;
    private final LoginValidator loginValidator;
    private final LoginService loginService;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) {//joinValidator 에있는 Errors
        //회원 가입 데이터 검증
        joinValidator.validate(form, errors); //전역 validator 에 넣었던 validator 때문에 없어도 동작 한다.

        if (errors.hasErrors()) { // reject, rejectValue 가 한번이라도 호출되면 true
            return "member/join";
        }

        joinService.process(form);

        return "redirect:/member/login";//주소가 바뀜 join쓰면 join 창에서 페이지만 바뀜
    }

    @GetMapping("/list")
    public String list(@Valid @ModelAttribute MemberSearch search, Errors errors) {
        log.info(search.toString());
        boolean result = false;
        if (!result) {
            throw new BadRequestException("예외 발생!");
        }
        return "member/list";
    }

    @GetMapping({"/info/{id}/{id2}", "/info/{id}"})
    public void info(@PathVariable("id") String email, @PathVariable(name = "id2", required = false) String email2) {
        log.info("email:{}, email2:{}", email, email2);
    }
    @ResponseBody
    @GetMapping("/list2")
    public List<Member> list(){
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("user" + i)
                        .regDt(LocalDateTime.now())
                        .build())
                .toList();
        return members;
    }
    @ExceptionHandler(BadRequestException.class)//발생할 예외의 종류
    public String errorHandler(BadRequestException e, HttpServletRequest request, HttpServletResponse response, Model model){
        e.printStackTrace();
        log.info("MemberController에서 유입");
        return "error/common";
    }


    //    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setValidator(joinValidator);
//    }
    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form, @CookieValue(name = "savedEmail", required = false) String savedEmail/*, @SessionAttribute(name = "member",required = false) Member member*/) {

        /*if(member != null) {
            log.info(member.toString());
        }*/
        if (savedEmail != null) {
            form.setSaveEmail(true);
            form.setEmail(savedEmail);
        }
        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {
        loginValidator.validate(form, errors);
        if (errors.hasErrors()) {
            return "member/login";
        }
        //로그인 처리
        loginService.process(form);
        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); //세션 비우기
        return "redirect:/member/login";
    }
}

