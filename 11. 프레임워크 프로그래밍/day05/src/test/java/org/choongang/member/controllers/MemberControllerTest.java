package org.choongang.member.controllers;

import org.choongang.config.MvcConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Locale;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringJUnitWebConfig//스프링 모듈 및 웹 관련된 설정 추가
@ContextConfiguration(classes = MvcConfig.class)
public class MemberControllerTest {
    @Autowired
    private WebApplicationContext ctx;//web.xml 에서의 contextClass 는 AnnotationConfigWebApplicationContext 이지만 다형성

    private MockMvc mockMvc;

    @BeforeEach
    void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    void test1() throws Exception {
        mockMvc.perform(post("/member/join")
                        .header("appKey", "1234")//header 에 appKey=1234 넣어준다
                        .contentType("application/json")//요청쪽의 contentType  바꿔주기
                )
                .andDo(print());
    }

    @Test
    void test2() throws Exception {
        mockMvc.perform(get("/member/join").header("Accept-Language", Locale.KOREAN.getLanguage())).andDo(print());
    }
}
