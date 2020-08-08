package com.AopLog4j;

import org.springframework.stereotype.Component;

@Component
public class Aop4j {
    public void sayHi(){
        System.out.println("今天真美好啊");
    }

    public void hesayHi(){
        System.out.println("他很帅");
    }

}
