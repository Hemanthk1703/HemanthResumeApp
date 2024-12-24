package com.hemanth.HemanthResumeService.appConfig;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title(" $$ Hemanth PortFolio Api $$")
                        .version("1.0")
                        .description("Hi There, I'm Hemanth, I'm into Backend Web Application Development\n\n" +
                                "API to showcase Hemanth's technical skills, experience, and projects")
                        .contact(new Contact().name("Hemanth Kumar Kokkula")
                                .email("kokkula.hemanth1@gmail.com")
                                .url("https://www.linkedin.com/in/hemanth-kokkula/")
                        )
                );
    }

}
