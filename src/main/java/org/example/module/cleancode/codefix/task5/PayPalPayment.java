package org.example.module.cleancode.codefix.task5;

public class PayPalPayment  extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
