package org.choongang.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.Locale;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MessageConfig.class)
public class MessageSourceTest {
    @Autowired
    MessageSource messageSource;

    @Test
    void test1() {
        String message = messageSource.getMessage("LOGIN_MSG", new Object[]{"user01", "user01"}, Locale.KOREAN);
        String message1 = messageSource.getMessage("이메일",null, Locale.KOREAN);
        System.out.println(message);
        System.out.println(message1);
    }
}
