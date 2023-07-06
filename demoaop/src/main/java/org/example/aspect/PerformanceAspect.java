package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class PerformanceAspect {

    @Around("@annotation(Performance) &&  execution(* org.example.service.*.*(..))")
    public Object monitorPerformance(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        Object result = point.proceed();
        long end = System.currentTimeMillis() - start;
        System.out.println("Execution time "+ end);
        return result;
    }
}
