package org.example.module.cleancode.codefix.task2;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer,
                                    boolean isFirstPurchase,
                                    boolean hasCoupon) {

        double discountRate = 0.0;

        if (isLoyalCustomer && isFirstPurchase) {
            discountRate = 0.10;
        } else if (isLoyalCustomer) {
            discountRate = 0.05;
        } else if (hasCoupon) {
            discountRate = 0.07;
        } else {
            discountRate = price * 0.02;
        }

        return price * (1 - discountRate);
    }
}
