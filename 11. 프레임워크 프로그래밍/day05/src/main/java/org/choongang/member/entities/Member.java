package org.choongang.member.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private String password;
    private String userName;
//    @JsonFormat(pattern = "yyyy년 MM월 dd일 HH:mm:ss")
    private LocalDateTime regDt;
}
