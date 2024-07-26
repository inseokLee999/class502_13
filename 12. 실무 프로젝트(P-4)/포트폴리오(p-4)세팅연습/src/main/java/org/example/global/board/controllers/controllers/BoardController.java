package org.example.global.board.controllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/write")
    public String join() {
        return "front/board/write";
    }

    @PostMapping("/write")
    public String joinPs() {
        return "redirect:/board/read";
    }

    @GetMapping("/read")
    public String login() {
        return "front/board/read";
    }
}
