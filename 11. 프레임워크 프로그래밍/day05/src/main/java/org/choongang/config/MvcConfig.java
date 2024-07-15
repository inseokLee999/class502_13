package org.choongang.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan("org.choongang")
@Import({DBConfig.class, MessageConfig.class})
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
}
