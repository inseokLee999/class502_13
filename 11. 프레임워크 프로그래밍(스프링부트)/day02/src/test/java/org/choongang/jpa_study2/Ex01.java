package org.choongang.jpa_study2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex01 {
    @PersistenceContext
    private EntityManager em;
    @Test
    void test1(){
        Member member = new Member();

        member.setEmail("test@test.org");
        member.setPassword("12345678");
        member.setUserName("사용자01");

        em.persist(member);
        em.flush();
        em.detach(member);
        em.flush();


    }
}
