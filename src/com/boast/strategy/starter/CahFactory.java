package com.boast.strategy.starter;

public class CahFactory {

    public static Cash createCash(String type) {
        Cash cash = null;
        switch (type) {
           case "Normal":
               cash = new NormalCash();
               break;
            case "Discount":
                cash = new DiscountCash(0.8);
                break;
            case "Rebate":
                cash = new RebateCash(300, 100);
                break;
        }

        return cash;
    }

}
