package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("@annotation(org.example.aspect.Loggable)")
    public void loggingBefore(JoinPoint joinPoint) {
        System.out.println("Method Invoked "+ joinPoint.getSignature().getName());
    }

    //@After("execution(* *.(..))")
    /*@Around("@annotation(org.example.aspect.Loggable)")
    public void loggingAfter(JoinPoint joinPoint) {
        System.out.println("Method Invoked "+ joinPoint.getSignature().getName());
    }*/

    @Around("@annotation(org.example.aspect.Loggable) && execution(* org.example.service.*.*(..))")
    public void loggingAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before ");
        joinPoint.proceed();
        System.out.println("After");
    }
}
