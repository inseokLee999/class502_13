package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ProxyCalculator2 {
/*
    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}
*/

    @Around("config.CommonPointcut.publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        try{
            Object result = joinPoint.proceed();
            return result;
        }finally {

        }
    }
}
