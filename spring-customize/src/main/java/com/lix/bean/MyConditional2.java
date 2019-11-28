package com.lix.bean;

import javafx.scene.control.ContentDisplay;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyConditional2 implements Condition {
    /**
     * @param context  判断上下文条件
     * @param metadata 注释信息
     * @return
     */

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取ioc容器
       /* ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        //获取运行环境
        System.out.println(Condition.class);
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property + "判断");
        if (property.contains("10"))
            return true;
        return false;
    }
}
