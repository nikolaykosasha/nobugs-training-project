package org.example.module.cleancode.designpatterns.task7_builderforcreatingorders;

public class Order {
    private Goods goods;
    private String sale;
    private String paymentMethod;

    public Order(Goods goods, String sale, String paymentMethod) {
        this.goods = goods;
        this.sale = sale;
        this.paymentMethod = paymentMethod;
    }

    public Order(Builder builder) {
        this.goods = builder.goods;
        this.sale = builder.sale;
        this.paymentMethod = builder.paymentMethod;
    }

    static class Builder {
        private Goods goods;
        private String sale;
        private String paymentMethod;

        public Builder setGoods(Goods goods) {
            this.goods = goods;
            return this;
        }

        public Builder setSale(String sale) {
            this.sale = sale;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
