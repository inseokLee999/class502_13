package org.choongang.member.api.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.choongang.member.services.JoinService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class ApiMemberController {
    private final MemberMapper memberMapper;
    private final JoinService joinService;


    @PostMapping()
    public ResponseEntity join(@RequestBody RequestJoin form){
        joinService.process(form);
        //응답 코드 201, 출력 바디 X
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/info/{email}")
    public Member info(@PathVariable("email") String email) {
        //Content-Type: application/json
        Member member = memberMapper.get(email);

        return member;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Member>> list() {
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("user" + i)
                        .regDt(LocalDateTime.now())
                        .build())
                .toList();
        HttpHeaders headers = new HttpHeaders(); //응답 헤더를 키 값 형태로 세팅 가능
        headers.add("t1","v1");
        headers.add("t2","v2");

        return new ResponseEntity<>(members/*바디데이터*/, headers/*헤더 데이터*/, HttpStatus.OK/*응답 코드*/);
    }

    @GetMapping(path = "/test", produces = "text/html;charset=UTF-8")
    public String test() {
        //content-Type  : text/plain

        return "안녕하세요라";
        //문자열을 받으면 template경로가 아니라 문자열 그자체를 출력
    }

    @GetMapping("/test2")
    public void test2() {
        log.info("test2...!!!");
    }
}
