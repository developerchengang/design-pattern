package com.boast.strategy.ultimate;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择类型：");

        String type = scanner.next();

        CashContext context = new CashContext("Rebate");
        double totalPrices = context.getResult(200);
        System.out.println("总计：" + totalPrices);

    }

}
