package com.AopPersion2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
        //无接口没有代理时实现spring aop的方法
       Persion persion=context.getBean("persion" ,Persion.class);
       persion.sleep();
    }
}
