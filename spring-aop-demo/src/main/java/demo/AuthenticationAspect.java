package demo;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @PointCut("within(demo..*)")
    public void authenticatingPointCut() {

    }

    @PointCut("within(demo.ShoppingCart.*)")
    public void authorizationPointCut() {

    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating Request");
    }
}
