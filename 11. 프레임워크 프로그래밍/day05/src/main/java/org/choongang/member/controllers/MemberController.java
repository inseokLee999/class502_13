package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {
    //    @GetMapping("/member/join")
    @RequestMapping(path = "/join", method = {RequestMethod.GET, RequestMethod.POST})
    public String join(Model model, HttpServletRequest request) {
        model.addAttribute("message", "뿡빵띠");
        System.out.println("Method(): " + request.getMethod());
        return "member/join";
    }
    @PostMapping("/join")
    public String joinPs(RequestJoin form){
        return "redirect:member/join";
    }
/*    @GetMapping("/member/join")
    public ModelAndView join() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","안녕하세요");
        mv.setViewName("member/join");
        return mv;
    }*/
}
