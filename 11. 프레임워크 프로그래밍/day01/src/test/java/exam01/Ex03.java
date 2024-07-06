package exam01;

import exam01.config.AppCtx1_Greeter;
import exam01.config.AppCtx2_JoinService;
import exam01.member.controllers.RequestJoin;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Ex03 {
    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2_JoinService.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
                .email("user01@test.org")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자01")
                .build();
        joinService.process(form);

        infoService.printList();

        ctx.close();
    }

    @Test
    void test2(){
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx1_Greeter.class,AppCtx2_JoinService.class);
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("exam01.config");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx1_Greeter.class);
        JoinService joinService = ctx.getBean(JoinService.class);//AppCtx2
        InfoService infoService = ctx.getBean(InfoService.class);//AppCtx2

        RequestJoin form = RequestJoin.builder()
                .email("user01@test.org")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자01")
                .build();
        joinService.process(form);

        infoService.printList();

        Greeter g1 = ctx.getBean(Greeter.class);
        g1.hello("이인석");

        ctx.close();
    }
}
