package com.boast.factory.simple.ultimate;

public class CalculatorFactory {

    public static Operator createOperator(String operatorType) {
        Operator operator = null;
        switch (operatorType) {
            case "+":
                operator = new Addition();
                break;
            case "-":
                operator = new Subtraction();
                break;
            case "*":
                operator = new Multiplication();
                break;
            case "/":
                operator = new Division();
                break;
        }
        return operator;
    }

}
