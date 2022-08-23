package demo;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
//        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: " + arg);
    }

    @After("execution(* *.*.checkout())")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    @PointCut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",
    returning = "retVal")
    public void afterReturning() {
        System.out.println("After Returning: " + retVal);
    }
}
