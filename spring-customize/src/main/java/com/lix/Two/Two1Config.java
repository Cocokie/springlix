package com.lix.Two;


import com.lix.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.lix.Two")
public class Two1Config {
    @Bean
    public Person person(){
        return new Person("d","d2");
    }


}
