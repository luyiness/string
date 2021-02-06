package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Date:2021/02_1:10 下午
 * @Description：
 */
@Component
@Aspect
public class UserProxy {

    @Before(value = "(execution(* com.example.User.add(..)))")
    public void method1(){
        System.out.println("before");
    }

    @After(value = "(execution(* com.example.User.add(..)))")
    public void method2(){
        System.out.println("after");
    }

    @AfterThrowing(value = "(execution(* com.example.User.add(..)))")
    public void method3(){
        System.out.println("AfterThrowing");
    }

    @Around(value = "(execution(* com.example.User.add(..)))")
    public void method4(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知 前....");

        proceedingJoinPoint.proceed();

        System.out.println("环绕通知 后....");
    }

}
