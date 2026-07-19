package org.example.module.cleancode.codefix.task5;

public class CreditCardPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
