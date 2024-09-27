package org.group4.BoardData;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.group4.board.entities.BoardData;
import org.group4.board.repositories.BoardDataRepository;
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
    @Test
    void test1(){
        List<BoardData> items = IntStream.rangeClosed(1,10)
                .mapToObj(i->BoardData.builder()
                        .seq((long) i)
                        .title("제목"+i)
                        .content("내용"+i)
                        .author("작성자"+i)
                        .build()).toList();
        items.forEach(System.out::println);
    }
}
