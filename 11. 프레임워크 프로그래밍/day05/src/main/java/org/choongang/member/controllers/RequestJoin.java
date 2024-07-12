package org.choongang.member.controllers;

import lombok.Data;

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
