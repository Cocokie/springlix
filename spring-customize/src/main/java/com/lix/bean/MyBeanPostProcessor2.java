package com.lix.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;



public class MyBeanPostProcessor2 implements BeanPostProcessor {
    public MyBeanPostProcessor2(){
        System.out.println("MyBeanPostProcessor2创建啦");
    }
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "在初始化之前启动2");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "在初始化之后启动2");
        return bean;
    }
}
