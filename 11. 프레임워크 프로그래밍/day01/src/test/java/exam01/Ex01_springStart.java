package exam01;

import exam01.config.AppCtx1_Greeter;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01_springStart {
    @Test
    void test1(){
        //스프링 컨테이너 객체
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx1_Greeter.class);

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("이인석");
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        g2.hello("홍길동");

        System.out.println(g1==g2);//주소 비교 - 싱글톤 형태로 관리
        ctx.close();
    }
    @Test
    void test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx1_Greeter.class);

        //싱글톤으로 기본 관리하므로 - 객체가 한개만 있는 경우가 많다.
        //class 클래스만 있어도 찾는다. DI 의존성 주입
        Greeter g1 = ctx.getBean(Greeter.class);//이름이 한개라면 이렇게만 써도 된다.
        g1.hello("잉석");


        ctx.close();
    }
}
