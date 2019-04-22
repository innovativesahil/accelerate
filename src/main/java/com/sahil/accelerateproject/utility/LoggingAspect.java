package com.sahil.accelerateproject.utility;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class LoggingAspect {

    @AfterThrowing(pointcut = "execution(* com.sahil.accelerateproject.controller*.*(..))", throwing = "exception")
    public void logExceptionFromController(Exception exception) throws Exception {
        log(exception);
        throw exception;
    }

    @AfterThrowing(pointcut = "execution(* com.sahil.accelerateproject.repository*.*(..))", throwing = "exception")
    public void logExceptionFromRepository(Exception exception) throws Exception {
        log(exception);
        throw exception;
    }

    private void log(Exception exception) {
        log.error(exception.getMessage(), exception);
    }

}
