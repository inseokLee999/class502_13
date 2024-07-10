package member.services;

import global.exceptions.BadRequestException;
import lombok.RequiredArgsConstructor;
import mappers.member.MemberMapper;
import member.controllers.RequestJoin;
import member.entities.Member;
import member.validators.JoinValidator;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final JoinValidator validator;
    private final MemberMapper memberMapper;

    public void process(RequestJoin form) {
        //유효성 검사
        validator.check(form);

        //비밀번호 해시화
        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        //DB 저장
        Member member = Member.builder()
                .email(form.getEmail())
                .password(hash)
                .userName(form.getUserName())
                .regDt(LocalDateTime.now())
                .build();
        int result = memberMapper.register(member);
        if (result < 1) {
            throw new BadRequestException("회원가입에 실패했습니다");
        }
    }
}
