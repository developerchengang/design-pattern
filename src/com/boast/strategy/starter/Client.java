package com.boast.strategy.starter;

public class Client {

    public static void main(String[] args) {
        Cash cash = CahFactory.createCash("Discount");
        double totalPrices = cash.acceptCash(100);
        System.out.println("总计：" + totalPrices);

    }
}
