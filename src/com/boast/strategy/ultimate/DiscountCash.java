package com.boast.strategy.ultimate;

public class DiscountCash implements Cash {

    private final double discount;

    public DiscountCash(double discount) {
        this.discount = discount;
    }

    @Override
    public double acceptCash(double money) {
        return money * discount;
    }
}
