package exam01.member.services;

import exam01.member.Assembler;
import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.validators.JoinValidator;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@RequiredArgsConstructor()
@Service
public class JoinService {

//    @Autowired//생성자를 직접 주입안해도 찾아서 해준다.
    private final JoinValidator validator;

//    @Autowired
    @NonNull
    private MemberDao memberDao;

    //의존 관계(없으면 객체 생성 X)
/*    public JoinService(JoinValidator validator, MemberDao memberDao){
        this.memberDao = memberDao;
        this.validator = validator;
    }*/
    //연관 관계 (생성자에서 넣는거에 비해 없어도 됨)
    /*
    public void setValidator(JoinValidator validator) {
        this.validator = validator;
    }
    */
    public void process(RequestJoin form){
        validator.check(form); //joinService는 validator 객체, form 객체를 의존 -> 의존성

        //데이터 영구 저장 - DAO(Data Access Object)
        Member member = Member.builder()
                .email(form.getEmail())
                .password(form.getPassword())
                .userName(form.getUserName())
                .regDt(LocalDateTime.now())
                .build();
        memberDao.register(member);
    }
}
