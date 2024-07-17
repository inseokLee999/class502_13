package org.choongang.member.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.choongang.config.MvcConfig;
import org.choongang.member.controllers.RequestJoin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Transactional
@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class ApiMemberControllerTest {
    @Autowired
    private ApiMemberController controller;
    private MockMvc mockMvc;

    @BeforeEach
    void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test() throws Exception {
        //Content-Type : application/x-www-form-urlencoded 기본값
        //jsp : 이름=값&이름=값 형태로..
/*        mockMvc.perform(post("/api/member")
                .param("email","user02@test.org")
                .param("password","12345678")
                .param("userName","user02"))
                .andDo(print());*/
//        content-Type : application/json
        RequestJoin form = new RequestJoin();
        form.setEmail("user99@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("user99");
        form.setAgree(true);

        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());
        String json = om.writeValueAsString(form);
        mockMvc.perform(post("/api/member")
                .contentType(MediaType.APPLICATION_JSON)//요청 헤더
                .content(json)//요청 바디
        ).andDo(print())
                .andExpect(status().isCreated());//의도한 대로 결과가 나오는지 테스트
//        결과는 null 인데
    }
    @Test
    void test2() throws Exception {
        mockMvc.perform(get("/api/member/list")).andDo(print()).andExpect(status().isOk());
    }
}
