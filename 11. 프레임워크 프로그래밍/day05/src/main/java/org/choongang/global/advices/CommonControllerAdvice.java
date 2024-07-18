package org.choongang.global.advices;

import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
//@ControllerAdvice("org.choongang")//적용될 범위 지정
public class CommonControllerAdvice {
    @ExceptionHandler(Exception.class)//controller 에서도 적용 가능
    public ModelAndView errorHandler(Exception e, Model model) {

        e.printStackTrace();
        log.info("advice 유입");
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }
        ModelAndView mv = new ModelAndView();
        mv.setStatus(status);
        mv.setViewName("error/common");
        return mv;
    }
}
