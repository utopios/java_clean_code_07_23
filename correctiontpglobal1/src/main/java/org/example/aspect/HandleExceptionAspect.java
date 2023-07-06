package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HandleExceptionAspect {

    @Around("@annotation(org.example.annotation.HandleException) && execution(* org.example.util.*.*(..))")
    public void handleExceptionExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            joinPoint.proceed();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
