package com.AopPersion4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SleepAdvice {
    //定义切点
    @Pointcut("execution(* *.sleep(..))")
    public void cut(){}
    @Before("cut()")//定义切点之前的方法
    public void begin(JoinPoint joinPoint){
        System.out.println("睡前敷面膜4");
        //joinPoint是利用反射机制来获取封装该方法的对象，基本上反射能实现的joinPoint都能实现
        System.out.println(joinPoint.getArgs());//获取传入目标方法的参数对象
        System.out.println(joinPoint.getTarget());//获取被代理的对象
        System.out.println(joinPoint.getSignature());//获取封装了署名信息的对象，在该对象中可以获取到目标方法名，所属类的Class等信息
        System.out.println(joinPoint.getThis());//获取代理对象
    }
//    @After("cut()")//定义切点之后的方法
//    public  void over(){
//        System.out.println("睡后做美梦4");
//    }
    @Around("cut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("睡前敷面膜哦哦");
        System.out.println("睡前洗澡");
        try {
            //以此代码为之前之后分界
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("睡后做美梦哦哦");
        System.out.println("睡后屙屎");
    }
}
