package com.lix;


import com.lix.bean.Person;
import com.lix.config.MainConfig;
import com.lix.config.MainConfigAutowire;
import com.lix.config.MainConfigOfLifeCycle;
import com.lix.web.controller.UserController;
import com.lix.web.service.UserService;
import com.test.User;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class ApplicationMain {
    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    public static void main(String[] args) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //Person person = applicationContext.getBean("person", Person.class);//
        String[] beanNamesForType = applicationContext.getBeanNamesForType(BeanPostProcessor.class, true, false);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        /*UserController bean = applicationContext.getBean(UserController.class);
        bean.test();*/
       /* for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        //test1();
      /*Person bean = applicationContext.getBean(Person.class);
        Person bean2 = applicationContext.getBean(Person.class);
        System.out.println(bean == bean2);*/

    }

    private static void test1() {
       /* Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);*/
        //UserController userController = applicationContext.getBean(UserController.class);

        //userController.test();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
