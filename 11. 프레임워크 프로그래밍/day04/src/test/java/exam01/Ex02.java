package exam01;

import config.AppCtx;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex02 {
//    @Autowired
//    private MemberRepository repository;
/*    @Test
    void test1(){
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);
    }
    @Test
    void test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberRepository repository = ctx.getBean(MemberRepository.class);
    }*/
}
