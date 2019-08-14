package com.matcher.top.it.aop;

import com.matcher.top.it.annotation.LoggerParam;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/10
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@Aspect
@Slf4j
public class LoggerParamAspect {

    @Around("execution(* com.matcher.top.it.*.*.*(..))")
    public Object loggerParamHandler(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        String name = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        LoggerParam methodAnnotation = Optional.of(proceedingJoinPoint).map(proceedingJoinPoint1 -> (MethodSignature) proceedingJoinPoint1.getSignature())
                .map(MethodSignature::getMethod).map(method -> method.getAnnotation(LoggerParam.class)).orElse(null);
        LoggerParam classAnnotation = Optional.of(proceedingJoinPoint).map(ProceedingJoinPoint::getTarget).map(Object::getClass)
                .map(clazz -> clazz.getAnnotation(LoggerParam.class)).orElse(null);

        if (!ObjectUtils.isEmpty(methodAnnotation)|| !ObjectUtils.isEmpty(classAnnotation)){
            log.info("[{AOP }]"+name+","+ Arrays.asList(args));
            log.info("[{AOP }]"+result+","+ result);
            log.info("[{AOP}]: "+(end - start)+"second");
            log.info("[{AOP }]"+(end-start)+"second");
        }
        return result;
    }
}
