package com.java.springbootdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lch
 * @create 2020-03-08 17:38
 */
@Aspect
@Component
public class HttpAspect {

    /**
     * 定义切面
     */
    @Pointcut("execution(public * com.java.springbootdemo.controller.GirlController.*(..))")
    public void log() {
    }


//    @Before("execution(public * com.java.springbootdemo.controller.GirlController.*(..))")
//    public void doBefore() {
//        System.out.println("日志打印前");
//    }
//
//    @After("execution(public * com.java.springbootdemo.controller.GirlController.*(..))")
//    public void doAfter() {
//        System.out.println("日志打印后");
//    }


    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("日志打印前");
        System.out.println("---------before---------");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        System.out.println("请求连接:"+request.getRequestURL());
        // method
        System.out.println("method方法:"+request.getMethod());
        // ip
        System.out.println("IP:"+request.getRemoteAddr());
        // 类方法
        System.out.println("类名:"+joinPoint.getSignature().getDeclaringTypeName()+
                "方法名称:"+joinPoint.getSignature().getName());
        // 参数
        System.out.println("参数:"+joinPoint.getArgs());

        System.out.println("---------before---------");
    }

    @After("log()")
    public void doAfter() {
        System.out.println("日志打印后");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void afterreturn(Object object) {
        System.out.println("返回参数:"+object);
    }
}
