package org.choongang.member.repositories;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringJUnitWebConfig//extends with spring, web mvc포함
@ContextConfiguration(classes = MvcConfig.class)
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    @DisplayName("repository Findall")
    void test1(){
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);
    }
    @Test
    @DisplayName("save 문")
    void test2(){
        Member member = Member.builder()
                .seq(21L)
                .email("user06@test.org")
                .password("123456")
                .userName("사용자34")
                .build();
        repository.save(member);
    }

    @Test
    @DisplayName("쿼리 메서드 findById")
    void test3(){
        Member member = repository.findById(3L).orElse(null);
        System.out.println(member);

        repository.delete(member);
    }

    @Test
    @DisplayName("쿼리 메서드 findByEmail")
    void test4(){
        Member member = repository.findByEmail("user06@test.org");
        System.out.println(member);
    }

    @Test
    @DisplayName("쿼리 메서드 테스트 findByUserNameContaining")
    void test5() {
        Pageable pageable = PageRequest.of(0, 10);
        Page<Member> members = repository.findByUserNameContaining("용자", pageable);
        //members.forEach(System.out::println);
    }

    @Test
    @DisplayName("복잡한 쿼리문")
    void test6(){
        List<Member> members = (List<Member>) repository.findByUserNameContainingAndEmailContainingOrderByRegDtDesc("용자","test");
        members.forEach(System.out::println);
        System.out.println(members);
    }

    @Test
    @DisplayName("@Query 문")
    void test7(){
        List<Member> members = repository.getMembers("%용자%","%gmail%");
        members.forEach(System.out::println);
    }
    @Test
    @DisplayName("page")
    void test8(){
        Pageable pageable = PageRequest.of(1, 3, Sort.by(desc("regDt"),asc("email")));
        Page<Member> data = repository.findByUserNameContaining("용자",pageable);
        List<Member> members = data.getContent();
        members.forEach(System.out::println);
        long total = data.getTotalElements();//조회된 전체 레코드 개수
        int pages = data.getTotalPages();
        System.out.printf("총 갯수 : %d, 총 페이지 수 :%d \n", total, pages);
    }
}
