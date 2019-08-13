package com.matcher.top.it.aop;

import com.matcher.top.it.annotation.LoggerParam;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * @description:
 * @project: matcher
 * @date: 2019/8/9
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@Aspect
public class LoggerParamAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerParamAspect.class);
    @Around("execution(* com.matcher.top.it.*.*.*(..))")
    public  Object loggerParamAspectHandler(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object[] args = proceedingJoinPoint.getArgs();
        String name = proceedingJoinPoint.getSignature().getName();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        LoggerParam methodAnnotion = Optional.of(proceedingJoinPoint).map(proceedingJoinPoint1 -> (MethodSignature) proceedingJoinPoint1.getSignature())
                .map(MethodSignature::getMethod).map(method -> method.getAnnotation(LoggerParam.class)).orElse(null);
        LoggerParam classAnnotation = Optional.of(proceedingJoinPoint).map(ProceedingJoinPoint::getTarget).map(Object::getClass).map(clazz -> clazz.getAnnotation(LoggerParam.class))
                .orElse(null);
        if (! ObjectUtils.isEmpty(methodAnnotion) || !ObjectUtils.isEmpty(classAnnotation)){
            LOGGER.info("[{AOP}]: "+name);
            LOGGER.info("[{AOP}]: "+ Arrays.asList(args));
            LOGGER.info("[{AOP}]: "+(end - start)+"second");
            LOGGER.info("[{AOP}]: "+result);
        }
        return result;
    }
}
