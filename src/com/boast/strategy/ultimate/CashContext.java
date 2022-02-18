package com.boast.strategy.ultimate;

public class CashContext {

    private Cash cash;

    // TODO: 对于不同的参数可以使用构建模式
    public CashContext(String type) {
        switch (type) {
            case "Normal":
                this.cash = new NormalCash();
                break;
            case "Discount":
                this.cash = new DiscountCash(0.8);
                break;
            case "Rebate":
                this.cash = new RebateCash(300, 100);
                break;
        }
    }

    public double getResult(double money) {
        return cash.acceptCash(money);
    }
}
