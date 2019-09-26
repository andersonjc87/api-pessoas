package com.api.pessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.api.pessoas")
public class ApiPessoasApplication extends SpringBootServletInitializer {

    public ApiPessoasApplication() {
        super();
        setRegisterErrorPageFilter(false); // <- this one
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiPessoasApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiPessoasApplication.class, args);
    }

}
