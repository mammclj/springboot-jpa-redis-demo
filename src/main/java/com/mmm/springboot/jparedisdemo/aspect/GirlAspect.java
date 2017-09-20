package com.mmm.springboot.jparedisdemo.aspect;

import com.mmm.springboot.jparedisdemo.exception.LogException;
import com.mmm.springboot.jparedisdemo.model.JsonResult;
import com.mmm.springboot.jparedisdemo.utils.JsonResultUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class GirlAspect {
    private static final Logger logger = LoggerFactory.getLogger(GirlAspect.class);

    @Before("execution(* com.mmm.springboot.jparedisdemo.controller.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("URL: {}", request.getRequestURL().toString());
        logger.info("HTTP_METHOD: {}", request.getMethod());
        logger.info("IP: {}", request.getRemoteAddr());
        logger.info("CLASS_METHOD: {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS: {}", Arrays.toString(joinPoint.getArgs()));
    }
}