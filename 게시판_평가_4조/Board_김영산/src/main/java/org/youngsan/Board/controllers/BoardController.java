package org.youngsan.Board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.youngsan.Board.entities.UserEntity;
import org.youngsan.Board.repositories.BoardRepository;
import org.youngsan.Board.service.BoardService;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @GetMapping({"", "/list"}) // 게시판
    public String list(Model model, @RequestParam(value = "page", defaultValue = "1") Integer pageNum) {

        model.addAttribute("boardData", boardService.list());
        return "board/list";
    }

    @GetMapping("/page")
    public String pages(@ModelAttribute RequestBoard requestBoard) { // 페이지
        return "board/page";
    }

    @PostMapping("/page")
    public String pagesPs(@Valid RequestBoard requestBoard, Errors errors) { // 상세 페이지

        if (errors.hasErrors()) {
            return "board/page";
        }
        boardService.pages(requestBoard);
        return "redirect:/board/list";
    }

    @GetMapping("/detail/{seq}")
    public String detail(@PathVariable("seq") Long seq, Model model) { // 게시물 수정 페이지
        model.addAttribute("boardData", boardService.detail(seq));
        return "board/detail";
    }

    @GetMapping("/update/{seq}")
    public String edit(@PathVariable("seq") Long seq, Model model) { // 수정 적용
        model.addAttribute("boardData", boardService.detail(seq));
        return "board/update";
    }

    @PostMapping("/update")
    public String updatePost(UserEntity userEntity) {

        boardService.update(userEntity);
        return "redirect:/board/list";
    }

    @GetMapping("/delete/{seq}")
    public String delete(@PathVariable("seq") Long seq) {

        boardService.delete(seq);
        return "redirect:/board/list";
    }


}
