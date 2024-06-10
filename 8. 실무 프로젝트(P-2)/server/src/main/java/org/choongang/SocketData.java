package org.choongang;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor //  모든 항목 생성자
public class SocketData {
    private String from;//보내는 쪽
    private String to;// 받는 쪽
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDt;

}
