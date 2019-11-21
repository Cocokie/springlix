package com.lix.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.lix.aop.MathCalculator.*(..))")
    public void pointCut() {
    }

    @Before(value = "pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("运行除法..参数列表是：{}");
    }


    @After("execution(public int com.lix.aop.MathCalculator.*(..))")
    public void logEnd() {
        System.out.println("除法结束..");
    }


    @AfterReturning(value = "pointCut()")
    public void logReturn() {
        System.out.println("除法返回正常..运行结果：{}");
    }


    @AfterThrowing(value = "pointCut()")
    public void logException() {
        System.out.println("除法异常..异常信息：{}");
    }
}
