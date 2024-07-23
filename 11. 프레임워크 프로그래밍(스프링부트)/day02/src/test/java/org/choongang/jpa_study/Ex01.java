package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test") //주로 설정 파일들
public class Ex01 {

//    @Autowired
//    private EntityManagerFactory emf;

//    @Autowired
    @PersistenceContext
    private EntityManager em;
    @Test
    void test1() {
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();//transaction 시작
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());
//      영속 상태 - 변화 감지 메모리에 있다, 변화 감지
        em.persist(member);//멤버 엔티티가 영속성 관리 상태가 된다 값의 변화에 따라서 쿼리가 알아서 실행 된다.

        em.flush();//INSERT 쿼리

        em.detach(member);//영속 상태 분리

        member.setUserName("(수정)사용자01");//변경
        member.setModifiedAt(LocalDateTime.now());//변경
        em.flush();//update 쿼리

        em.merge(member);
        em.flush();
//        em.remove(member);//제거 상태, 제거 된거 아니고 상태만 제거
//
//        em.flush();//delete 쿼리

//        tx.commit();
    }
}
