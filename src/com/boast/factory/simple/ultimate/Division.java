package com.boast.factory.simple.ultimate;

public class Division implements Operator {

    @Override
    public int operation(int numA, int numB) {
        if (numB == 0) {
            return 0;
        }
        int sum = numA / numB;
        System.out.println("除法结果：" + sum);
        return sum;
    }
}
