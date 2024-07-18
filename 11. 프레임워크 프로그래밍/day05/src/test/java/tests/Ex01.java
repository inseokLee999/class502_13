package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.choongang.config.MvcConfig;
import org.choongang.exam.PostData;
import org.choongang.member.controllers.RequestJoin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Transactional
@SpringJUnitWebConfig()
@ContextConfiguration(classes = MvcConfig.class)
public class Ex01 {
    @Autowired//수동 등록 빈
    private ObjectMapper om;

    @Test
    void test1() {
        URI url = UriComponentsBuilder.fromUriString("https://m.sports.naver.com")
                .path("/wfootball/{article}")//{}는 변수 처리
                .queryParam("t1", "v1")
                .queryParam("t2", "v2")
                .queryParam("t3", "한글")
                .queryParam("t4", "aa{1}")
                .fragment("hash")
//                .encode()
                .build("호우", "주의", false);

        System.out.println(url.toString());
    }

    @Test
    void test2() {
        RestTemplate restTemplate = new RestTemplate();
//        String data = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);
//        System.out.println(data);
        PostData postData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", PostData.class);
        System.out.println(postData);
    }

    @Test
    void test3() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String body = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);

//        System.out.println(body);
        //단일 객체 형태 일때는 이런 형식으로 변환
        PostData data = om.readValue(body, PostData.class);
        System.out.println("data : " + data);

        String itemsBody = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);

//        System.out.println("data2 : " + itemsBody);

        List<PostData> items = om.readValue(itemsBody, new TypeReference<>() {
        });
        items.forEach(System.out::println);
    }

    @Test
    @DisplayName("JSON 형식으로 POST 처리 예시")
    void test4() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        RequestJoin form = new RequestJoin();
        form.setEmail("user772@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("user77");
        form.setAgree(true);
        System.out.println("form : " + form);
        String params = om.writeValueAsString(form);
        System.out.println(params);

        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/json");
//        headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(params, headers);
        String url = "http://localhost:3000/day05/api/member";
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
        System.out.println(response);


    }
    @Test
    @DisplayName("일반 양식 형식으로 전송 - ContentType : application/x-www-form-urlencoded")
    void test5 () {
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        params.add("email", "user77@test.org");
        params.add("password", "12345678");
        params.add("confirmPassword", "12345678");
        params.add("userName", "user77");
        params.add("agree", "true");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String,String>> request = new HttpEntity<>(params, headers);
        String url = "http://localhost:3000/day05/member/join";
        ResponseEntity<String> response = restTemplate.postForEntity(url,request,String.class);
        System.out.println(response);
    }
}
