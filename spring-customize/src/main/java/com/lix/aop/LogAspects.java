package com.lix.aop;

public class LogAspects {
    public void logStart(){
        System.out.println("运行除法..参数列表是：{}");
    }
    public void logEnd(){
        System.out.println("除法结束..");
    }
    public void logReturn(){
        System.out.println("除法返回正常..运行结果：{}");
    }
    public void logException(){
        System.out.println("除法异常..异常信息：{}");
    }
}
