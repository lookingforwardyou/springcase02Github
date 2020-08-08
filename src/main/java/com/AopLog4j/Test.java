package com.AopLog4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springLog4j.xml");
        Aop4j aop4j=context.getBean("aop4j",Aop4j.class);
        aop4j.sayHi();
        aop4j.hesayHi();
        System.out.println("你好");
    }

}
