package com.example;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1111-1111-1111-1111");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(400.0);

        PaymentStrategy payPalPayment = new PayPalPayment("samyakbhattacharya7@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.pay(500.0);
    }
}

