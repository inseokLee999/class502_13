package org.choongang.member.api.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.Utils;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.exceptions.CommonException;
import org.choongang.global.rests.JSONData;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.choongang.member.services.JoinService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
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
    private final Utils utils;

    @PostMapping
    public ResponseEntity join(@RequestBody @Valid RequestJoin form, Errors errors) {
        if (errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }
        boolean result = false;
        if (!result) {
//            throw new BadRequestException("예외 테스트!");
        }

        joinService.process(form);
        //응답 코드 201, 출력 바디 X
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/info/{email}")
    //200 이면 굳이 responseEntity 안쓰고 JSON 으로 써도됨
    public JSONData info(@PathVariable("email") String email) {
        //Content-Type: application/json
        Member member = memberMapper.get(email);

        return new JSONData(member);
    }

    @GetMapping("/list")
    //응답코드가 다르거나 헤더가 상세한 설정이 필요할 때는 ResponseEntity
    public ResponseEntity<JSONData> list() {
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("user" + i)
                        .regDt(LocalDateTime.now())
                        .build())
                .toList();
        HttpHeaders headers = new HttpHeaders(); //응답 헤더를 키 값 형태로 세팅 가능
        headers.add("t1", "v1");
        headers.add("t2", "v2");

//        return new ResponseEntity<>(members/*바디데이터*/, headers/*헤더 데이터*/, HttpStatus.OK/*응답 코드*/);
        return new ResponseEntity<>(new JSONData(members), headers, HttpStatus.OK);
    }

    @GetMapping(path = "/test", produces = "text/html;charset=UTF-8")
    public String test() {
        //content-Type  : text/plain

        return "안녕하세요라";
        //문자열을 받으면 template 경로가 아니라 문자열 그자체를 출력
    }

    @GetMapping("/test2")
    public void test2() {
        log.info("test2...!!!");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData> errorHandler(Exception e) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }

        JSONData data = new JSONData();
        data.setSuccess(false);
        data.setStatus(status);
        data.setMessage(e.getMessage());

        e.printStackTrace();

        return ResponseEntity.status(status).body(data);
    }

}
