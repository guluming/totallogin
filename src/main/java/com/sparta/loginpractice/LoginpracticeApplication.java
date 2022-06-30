package com.sparta.loginpractice;

import com.sparta.loginpractice.config.properties.AppProperties;
import com.sparta.loginpractice.config.properties.CorsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        CorsProperties.class,
        AppProperties.class
})
public class LoginpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginpracticeApplication.class, args);
    }

}
