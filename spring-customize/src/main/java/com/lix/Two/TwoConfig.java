package com.lix.Two;


import com.lix.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwoConfig {
    @Bean
    public Color color(){
        return new Color();
    }
}
