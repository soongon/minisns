package kr.re.kitri.minisns.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* kr.re.kitri.minisns.service.*.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = pjp.getSignature().getName();
        String className = pjp.getSignature().getDeclaringTypeName();
        logger.info(className + "." + methodName +  " 함수 실행전에 로그를 남깁니다.");

        Object obj = pjp.proceed();

        logger.info(className + "." + methodName +  " 함수 실행후에 로그를 남깁니다.");
        return obj;
    }

}
