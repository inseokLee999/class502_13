package org.choongang.global;

import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MessageUtil {
    public static void alertError(Exception e, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        if(e instanceof CommonException commonException){
            resp.setStatus(commonException.getStatus());
        }
        /*
        if(e instanceof CommonException){
            CommonException commonException = (CommonException)e;
            resp.setStatus(commonException.getStatus());
        }
        */
        PrintWriter out = resp.getWriter();
        out.printf("<script>alert('%s');</script>", e.getMessage());
    }

    public static void go(String url, String target,HttpServletResponse resp) throws IOException {
        target = target == null || target.isBlank() ? "self" : target;

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        /*
        * location.href : 주소 이동시 이동기록이 남는다, 뒤로가기 버튼을 누른 경우
        * POST 처리가 중독 된다.
        * POST 처리시 이동 할 때는 기록을 남기지 않는 이동 방식인 location.replace()
        * */
//        out.printf("<script>%s.location.href='%s';</script>",target,url);
        out.printf("<script>%s.location.replace('%s');</script>",target,url);
    }
    public static void go(String url, HttpServletResponse resp)throws IOException{
        go(url,"self",resp);
    }
}
