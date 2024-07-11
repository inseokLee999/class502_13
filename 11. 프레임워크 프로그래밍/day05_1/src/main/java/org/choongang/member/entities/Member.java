package org.choongang.member.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    @Id
    @Column("ID")
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime regDt;

}
