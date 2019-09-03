package com.lix.config;


import com.lix.web.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.lix.web")
public class MainConfigAutowire {
    @Bean
    public UserService userService2(){
        return new UserService("2");
    }
}
