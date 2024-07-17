package org.choongang.member.mappers;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MapperTest {
    @Autowired
    private MemberMapper memberMapper;
    @Test
    void test1(){
        long result = memberMapper.exists("test@test.org");
        System.out.println(result);
    }
    @Test
    @DisplayName("로그인 테스트")
    void test2(){
        Member member = memberMapper.get("test@test.org");
        System.out.println(member);
    }
}
