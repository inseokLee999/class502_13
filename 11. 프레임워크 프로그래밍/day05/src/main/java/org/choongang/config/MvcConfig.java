package org.choongang.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("org.choongang")
//@Import({DBConfig.class, MessageConfig.class, InterceptorConfig.class, FileConfig.class})
// ComponentScan 에서 스캔을 해줘서 쓸필요 없음
//@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {
/*
    private final JoinValidator joinValidator;

    //모든 컨트롤러에 적용 될 수 있는 전역 validator
    @Override
    public Validator getValidator() {
        return joinValidator;
    }
*/

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");// /** : 현재 경로를 포함한 하위 경로 (현재는 모든 경로)

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {//컨트롤러 구성을 할 필요 없는 간단한 페이지 구성시
        registry.addViewController("/").setViewName("main/index");
        registry.addViewController("/mypage").setViewName("mypage/index");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/templates/", ".jsp");//스프링에서 반환값이 나오면 prefix, suffix사이로 들어가게 된다.
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        String fileName = "application";
        String profile = System.getenv("spring.profiles.active");
        fileName += StringUtils.hasText(profile) ? "-" + profile:"";
        /*
        * spring.profiles.active=dev
        * -> application-dev
        *
        * spring.profiles.active=prod
        * -> application-prod
        * */
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocations(new ClassPathResource(fileName+".properties"));//classpath에있는 resource인식
        return configurer;
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ObjectMapper objectMapper = Jackson2ObjectMapperBuilder
                .json()
//                .xml() //implementation 'com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.17.2'
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(formatter))
                .build();
        converters.add(0, new MappingJackson2HttpMessageConverter(objectMapper));
    }
}
