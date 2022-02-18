package com.boast.factory.simple.ultimate;

public class Subtraction implements Operator {

    @Override
    public int operation(int numA, int numB) {
        int sum = numA - numB;
        System.out.println("减法结果：" + sum);
        return sum;
    }
}
