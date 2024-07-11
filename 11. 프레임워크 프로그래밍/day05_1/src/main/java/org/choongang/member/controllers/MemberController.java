package org.choongang.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {


    @RequestMapping(path = "/join",method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/join")
    public String join(){
        return "redirect:/member/join";
    }
}
