package com.boast.strategy.starter;

public class NormalCash implements Cash {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
