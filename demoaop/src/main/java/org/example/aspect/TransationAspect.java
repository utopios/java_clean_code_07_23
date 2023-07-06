package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.service.TransactionService;

@Aspect
public class TransationAspect {

    private TransactionService transactionService = new TransactionService();
    @Around("@annotation(org.example.aspect.Transaction)")
    public void aroundTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            //String level = transaction.value()
            //Récupérer l'annotation pour récupérer un argument
            Transaction transaction = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(Transaction.class);
            System.out.println(transaction.value());
            transactionService.begin();
            joinPoint.proceed();
            transactionService.commit();
        }catch (Exception ex) {
            transactionService.rollBack();
        }
    }
}
