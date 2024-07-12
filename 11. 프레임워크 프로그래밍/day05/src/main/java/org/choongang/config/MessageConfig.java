package org.choongang.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setBasename("messages.commons");
        ms.setDefaultEncoding("UTF-8");

        ms.setUseCodeAsDefaultMessage(true);//코드그대로 디폴드값
        return ms;
    }
}
