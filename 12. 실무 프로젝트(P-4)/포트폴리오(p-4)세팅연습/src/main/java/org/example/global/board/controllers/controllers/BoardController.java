package org.example.global.board.controllers.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.global.board.controllers.entities.BoardData;
import org.example.global.board.controllers.repositories.BoardDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/board")
public class BoardController {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private BoardDataRepository boardDataRepository;

    @GetMapping("/write")
    public String write(@ModelAttribute BoardData boardData, Model model) {
        return "front/board/write";
    }

    @PostMapping("/write")
    public String writePs(@ModelAttribute BoardData boardData, Model model) {
        boardDataRepository.saveAndFlush(boardData);
        return "redirect:/board/read";
    }

    @GetMapping("/read")
    public String read(Model model) {
        List<BoardData> items = boardDataRepository.findAll();
        model.addAttribute("items", items);
        return "front/board/read";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable("id") Long id) {
        boardDataRepository.deleteById(id);
        return "redirect:/board/read";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        Optional<BoardData> boardData = boardDataRepository.findById(id);
        if (boardData.isPresent()) {
            model.addAttribute("boardData", boardData.get());
            return "front/board/update";
        } else {
            return "redirect:/board/read";
        }
    }

    @PostMapping("/update")
    public String updatePs(@ModelAttribute BoardData boardData) {
        boardDataRepository.saveAndFlush(boardData);
        return "redirect:/board/read";
    }
}
