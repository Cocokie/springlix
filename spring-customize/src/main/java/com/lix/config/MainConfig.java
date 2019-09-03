package com.lix.config;


import com.lix.bean.MyConditional;
import com.lix.bean.MyConditional2;
import com.lix.bean.Person;
import com.lix.web.controller.UserController;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import com.lix.bean.Color;
//这个注解相当于开始的配置文件
@Configuration
@ComponentScan(value = "com.lix.web", excludeFilters = {

        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)
}
)
@Import(value = Color.class)
public class MainConfig {
    //给容器注册一个Bean,类型为返回值,id默认为方法名，相当于XML中的(id='person' Class='Person')
    @Bean(name = "person3")
    @Lazy
    public Person person() {
        System.out.println("创建Person");
        return new Person("lixin", "66");
    }

    @Bean(name = "kof")
    @Conditional(value = MyConditional.class)
    public Person person2() {
        return new Person("头上佛", "18");
    }

    @Bean(name = "lol")
    @Conditional(value = MyConditional2.class)
    public Person person3() {
        return new Person("jinx", "18");
    }
}
