package org.choongang.global.rests;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@RequiredArgsConstructor//data 포함된 생성자
@NoArgsConstructor //기본생성자
public class JSONData {
    //많이 쓰는 거 ok
    private HttpStatus status = HttpStatus.OK;
    //많이 쓰는거 성공 시
    private boolean success = true;
    //성공이나 실패시 띄울 메세지
    private Object message;
    @NonNull
    private Object data;

}
