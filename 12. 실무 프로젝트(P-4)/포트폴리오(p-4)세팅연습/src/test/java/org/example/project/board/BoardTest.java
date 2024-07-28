package org.example.project.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.global.board.controllers.entities.BoardData;
import org.example.global.board.controllers.repositories.BoardDataRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
public class BoardTest {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private BoardDataRepository boardDataRepository;

    @BeforeEach
    void init(){
        List<BoardData> items = IntStream.rangeClosed(1,10)
                .mapToObj(i->BoardData.builder()
                        .title("제목"+i)
                        .content("내용"+i)
                        .build()).toList();
        boardDataRepository.saveAllAndFlush(items);
        em.clear();
    }
    @Test
    void test1(){
        List<BoardData> items = boardDataRepository.findAll();
        items.forEach(System.out::println);
    }
}
