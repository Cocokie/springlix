package com.lix.config;


import com.lix.aop.LogAspects;
import com.lix.aop.MathCalculator;
import com.lix.bean.MyBeanPostProcessor;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@Import(value = MyBeanPostProcessor.class)
public class MainConfigOfAop {
    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
