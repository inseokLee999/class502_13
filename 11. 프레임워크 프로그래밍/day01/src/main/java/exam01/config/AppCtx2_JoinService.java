package exam01.config;

import exam01.member.dao.MemberDao;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import exam01.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppCtx2_JoinService {
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2(){
        return new MemberDao();
    }
    @Bean
    public JoinValidator joinValidator(){
        JoinValidator joinValidator = new JoinValidator();

        return joinValidator;
    }

    @Bean
    public JoinService joinService(){
        return new JoinService(joinValidator(),memberDao());
    }

    @Bean
    public InfoService infoService(){
        InfoService infoService = new InfoService();

        return infoService;
    }

    @Bean //자바 JDK, 외부 라이브러리 는 수동 등록이 필수
    public DateTimeFormatter dateTimeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return formatter;
    }

}
