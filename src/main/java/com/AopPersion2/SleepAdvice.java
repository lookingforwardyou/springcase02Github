package com.AopPersion2;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    @Override//在切点之前实现的方法
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("睡前敷面膜2");
    }
    @Override//在切点之后实现的方法
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("睡后做美梦2");
    }


}
