package com.boast.factory.simple.ultimate;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字A：");

        int numA = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.print("请输入运算符（+、-、*、/）：");
        String operatorType = scanner.next();

        scanner = new Scanner(System.in);
        System.out.print("请输入数字B：");

        int numB = scanner.nextInt();

        Operator operator = CalculatorFactory.createOperator(operatorType);
        int sum = operator.operation(numA, numB);


    }

}
