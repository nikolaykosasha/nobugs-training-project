package org.example.module.cleancode.codefix.task5;

public class BitcoinPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
