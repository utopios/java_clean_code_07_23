package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerformanceAspect {

    @Around("@annotation(org.example.aspect.Performance)")
    public Object monitorPerformance(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = point.proceed();
        long end = System.currentTimeMillis() - start;
        System.out.println("Exection time "+ end);
        return result;
    }
}
