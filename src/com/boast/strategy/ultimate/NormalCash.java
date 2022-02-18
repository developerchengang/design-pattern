package com.boast.strategy.ultimate;

public class NormalCash implements Cash {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
