package org.sergei.social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class SpringBootEntryPoint extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(applicationClass);
    }

    private static Class<SpringBootEntryPoint> applicationClass = SpringBootEntryPoint.class;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEntryPoint.class, args);
    }
}
