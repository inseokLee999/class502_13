package org.choongang.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestJoin {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 8)
    private String password;
    @NotBlank
    private String confirmPassword;
    @NotBlank
    private String userName;
    @AssertTrue
    private boolean agree;
}
/*
@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
//    private String[] hobby;
//    private Set<String> hobbySet;
    private String hobby;
    private boolean agree;
    private Address addr;//addr.속성명 으로 함
}
*/
