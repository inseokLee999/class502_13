package org.choongang.global.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//문서에 대한 설명들
@OpenAPIDefinition(info = @Info(title = "API 명세", description = "설명...", contact = @Contact(name = "이인석", email = "syt06137@naver.com"), version = "v1"))
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("API 명세 v1")
                .pathsToMatch("/api/v1/**")
                .build();
    }
}
