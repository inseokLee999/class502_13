package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

public class CommonException extends RuntimeException {
    private int status;//응답코드
    public CommonException(String message){
        this(message, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);//메세지만 넣으면 응답 코드를 500으로 설정
    }
    public CommonException(String message,int status) {
        super(message);
    this.status = status;
    }
    public int getStatus() {
        return status;
    }
}
