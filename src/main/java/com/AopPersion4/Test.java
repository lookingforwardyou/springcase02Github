package com.AopPersion4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring4.xml");
        Persion persion=context.getBean("persion",Persion.class);
        persion.sleep();
    }
}
