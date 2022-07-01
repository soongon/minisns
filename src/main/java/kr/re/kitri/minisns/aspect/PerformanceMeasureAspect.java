package kr.re.kitri.minisns.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMeasureAspect {

    public static Logger logger = LoggerFactory.getLogger(PerformanceMeasureAspect.class);

    @Around("execution(* kr.re.kitri.minisns.controller.PostController.*(..))")
    public Object measurePerformance(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object obj = pjp.proceed();

        long runningTime = System.currentTimeMillis() - startTime;

        logger.info(pjp.getSignature().getDeclaringTypeName() + "." +
                    pjp.getSignature().getName() + " 수행시간 : " + runningTime + "ms");

        return obj;
    }
}
