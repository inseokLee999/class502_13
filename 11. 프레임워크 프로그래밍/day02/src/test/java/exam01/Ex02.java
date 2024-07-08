package exam01;

import board.services.BoardService;
import board.services.BoardService2;
import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    @Test
    public void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        BoardService service = ctx.getBean(BoardService.class);

        BoardService2 s1= ctx.getBean(BoardService2.class);
        BoardService2 s2= ctx.getBean(BoardService2.class);

        ctx.close();
    }
}