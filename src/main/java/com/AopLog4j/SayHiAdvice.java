package com.AopLog4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Component
@Aspect
public class SayHiAdvice {

    Logger logger = Logger.getLogger(Test.class);
    String strLog = null ;

    @Pointcut("execution(* com.AopLog4j.Aop4j.*(..))")//匹配SayHiAdvice中声明的所有方法
    public void sayHi(){}

    @Before("sayHi()")
    public void before(JoinPoint jp){
        strLog ="before:log Begining method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName();
        logger.warn(strLog);
    }
    @Around("sayHi()")
    public void around(ProceedingJoinPoint pjp){
        long time = System.currentTimeMillis();
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        time = System.currentTimeMillis() - time;
        System.out.println("process time: " + time + " ms");
    }
    @After("sayHi()")
    public void after(JoinPoint jp){
        strLog ="after:log Ending method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName();
        logger.warn(strLog);
    }
}
