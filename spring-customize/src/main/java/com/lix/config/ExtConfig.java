package com.lix.config;


import com.lix.bean.ExtBeanDefinitionRegistry;
import com.lix.bean.ExtBeanFactoryProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lix.bean")
public class ExtConfig {

}
