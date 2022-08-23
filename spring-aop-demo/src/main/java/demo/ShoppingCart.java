package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        // Logging
        // Authentication & Authorization
        // Sanitization
        System.out.println("Checkout Method from ShoppingCart called");
    }

    public int quantity() {
        return 2;
    }
}
