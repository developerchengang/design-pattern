package com.boast.factory.simple.ultimate;

public class Multiplication implements Operator {

    @Override
    public int operation(int numA, int numB) {
        int sum = numA * numB;
        System.out.println("乘法结果：" + sum);
        return sum;
    }
}

