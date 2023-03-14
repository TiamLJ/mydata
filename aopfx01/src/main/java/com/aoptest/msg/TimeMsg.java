package com.aoptest.msg;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Component
@Aspect //告诉spring这是一个切面
public class TimeMsg {
    //切入点匹配连接点
//    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.*(..))")
//    private void funTime1(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.fun1())")
    private void funTime1(){}

    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.fun2())")
    private void funTime2(){}

    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.fun3())")
    private void funTime3(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.fun4())")
    private void funTime4(){}
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.fun5())")
    private void funTime5(){}

    //前置通知
    @Before("funTime1()")
    public void msg1(){
//        System.out.println("这是一个前置通知");
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter DF=DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS");
        String formatterDateTime=now.format(DF);
        System.out.println(formatterDateTime);
    }

    //后置通知g(代码有无异常都会通知)
    @After("funTime2()")
    public void msg2(){
        System.out.println("这是一个后置通知");
    }

    //环绕通知
    @Around("funTime3()")
    public Object msg3(ProceedingJoinPoint proint) throws Throwable {
//        System.out.println("这是一个环绕通知1");
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter DF=DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS");
        String formatterDateTime=now.format(DF);
        System.out.println(formatterDateTime);
        Object obj=proint.proceed();
        System.out.println(formatterDateTime);
//        System.out.println("这是一个环绕通知2");
        return obj;
    }

//返回通知
    @AfterReturning("funTime4()")
    public void msg4(){
        System.out.println("这是一个返回通知");
    }

//异常通知
    @AfterThrowing("funTime5()")
    public void msg5(){
        System.out.println("这是一个异常通知");
    }


}
