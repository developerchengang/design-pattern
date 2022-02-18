package com.boast.strategy.ultimate;

public class RebateCash implements Cash {

    private final double conditionMoney;
    private final double rebateMoney;

    public RebateCash(double conditionMoney, double rebateMoney) {
        this.conditionMoney = conditionMoney;
        this.rebateMoney = rebateMoney;
    }

    @Override
    public double acceptCash(double money) {
        if (money < conditionMoney) {
            return money;
        }
        return money - Math.floor(money / conditionMoney) * rebateMoney;
    }
}
