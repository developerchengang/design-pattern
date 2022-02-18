package com.boast.factory.simple.starter;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字A：");

        int numA = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.print("请输入运算符（+、-、*、/）：");
        String operator = scanner.next();

        scanner = new Scanner(System.in);
        System.out.print("请输入数字B：");

        int numB = scanner.nextInt();

        int sum;

        switch (operator) {
            case "+":
                sum = numA + numB;
                System.out.println("加法结果：" + sum);
                break;
            case "-":
                sum = numA - numB;
                System.out.println("减法结果：" + sum);
                break;
            case "*":
                sum = numA * numB;
                System.out.println("乘法结果：" + sum);
                break;
            case "/":
                if (numB != 0) {
                    sum = numA / numB;
                    System.out.println("除法结果：" + sum);
                }
                break;
        }

    }

}
