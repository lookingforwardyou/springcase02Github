package com.noaop;

public class Person {

    public void sleep(){
        a();
        System.out.println("睡觉"); //核心功能
        b();
    }
    public void a(){
        System.out.println("睡前敷面膜");
    }
    public void b(){
        System.out.println("睡后做美梦");
    }

    public static void main(String[] args) {

        new Person().sleep();
    }
}
