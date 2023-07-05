package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    //@Before("execution(* *.(..))")
    @After("@annotation(org.example.aspect.Loggable)")
    public void loggingBefore(JoinPoint joinPoint) {
        System.out.println("Method Invoked "+ joinPoint.getSignature().getName());
    }
}
