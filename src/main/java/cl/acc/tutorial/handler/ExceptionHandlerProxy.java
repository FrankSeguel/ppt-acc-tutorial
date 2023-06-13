package cl.acc.tutorial.handler;

import cl.acc.tutorial.exception.BusinessException;
import cl.acc.tutorial.exception.ErrorTecnicoException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author fseguel
 */

@Aspect
@Component
public class ExceptionHandlerProxy {
    
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerProxy.class);
    
    @Around("execution(* com.example.usuarios.controller.*.*(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        try {
            return joinPoint.proceed();
        } catch (BusinessException e) {
            logger.error(e.getDescripcion() );
            throw e;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new ErrorTecnicoException("ERROR", e.getMessage());
        }

    }
}
