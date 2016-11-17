package com.cms.shop.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-15
 */
@Service
public class Transaction {

    /**
     * 前置通知
     * @param joinPoint　连接点
     */
    public void beginTransaction(JoinPoint joinPoint){
        System.out.println("begin transaction");
        System.out.println("args:"+joinPoint.getArgs().toString());
        System.out.println("methodName"+joinPoint.getSignature().getName());
    }

    /**
     *后置通知
     */
    public void commit(){
        System.out.println(" commit ");
    }

    /**
     * 异常通知
     */
    public void throwingMethod(JoinPoint joinPoint,Throwable ex){
        System.out.println(ex.getMessage());
    }

    /**
     * 最终通知
     */
    public void finallyMethod(){
        System.out.println("finally method");
    }
    /**
     * 环绕通知
     *   控制目标方法的执行
     */
    public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();//获取目标方法的名称
        /*if(methodName.equals("save")){
            joinPoint.proceed();//调用目标方法
        }else{
            System.out.println("权限不足");
        }*/
        System.out.print("执行方法:"+methodName);
        joinPoint.proceed();//调用目标方法
    }
}
