package org.choongang.jpa_study2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = {"spring.profiles.active=test"})
public class Ex02 {
    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        for (long i = 1; i <= 10L; i++) {
            Member member = new Member();
//            member.setSeq(i);
            member.setEmail("user" + i + "@test.org");
            member.setPassword("12345678");
            member.setUserName("사용자" + i);
            member.setCreatedAt(LocalDateTime.now());
            em.persist(member);
        }
        em.flush();//DB 영구 반영
        em.clear();
    }
    @Test
    void test(){
        Member member = em.find(Member.class, 1L);
        Member member2 = em.find(Member.class, 1L);
        System.out.println(member==member2);
    }
}
