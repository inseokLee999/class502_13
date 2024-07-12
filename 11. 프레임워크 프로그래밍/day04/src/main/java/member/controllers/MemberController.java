package member.controllers;

import member.services.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @Autowired
    private JoinService joinService;
    @GetMapping("/member/join")
    public String join(@RequestParam(name =  "name"/*,required = false*/,defaultValue = "뀨") String name){//변수명이 동일 해야함
        System.out.println("name : "+name);
        return "member/join";
    }

    @PostMapping("/member/join")
    public String joinPs(RequestJoin/*커멘드 객체*/ form){
        System.out.println(form);
        joinService.process(form);
        return "member/join";
    }
}
