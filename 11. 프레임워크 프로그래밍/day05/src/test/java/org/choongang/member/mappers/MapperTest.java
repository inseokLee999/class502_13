package org.choongang.member.mappers;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MapperTest {
    @Autowired
    private MemberMapper mapper;

    @Test
    void test1(){
        long total = mapper.getTotal();
        System.out.println(total);
    }
    @Test
    @DisplayName("로그인 테스트")
    void test2(){
        Member member = mapper.get("test@test.org");
        System.out.println(member);
    }
}
