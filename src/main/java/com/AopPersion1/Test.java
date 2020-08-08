package com.AopPersion1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
        //有接口时实现spring aop的方法
        IPersion iPersion=(IPersion)context.getBean("persionProxy");
        iPersion.sleep();
    }
}
