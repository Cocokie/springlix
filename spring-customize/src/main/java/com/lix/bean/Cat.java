package com.lix.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("This is a tom Cat");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("init cat");
    }

    public void destroy() throws Exception {
        System.out.println("destroy cat");
    }


}
