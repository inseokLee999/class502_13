package org.choongang.member.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table("CH_MEMBER")
public class Member {
    @Id//기본키 명시
//    @Column("ID")//컬럼명 매칭
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime regDt;
}
