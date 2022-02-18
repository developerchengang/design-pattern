package com.boast.decorator.ultimate;

public class Sneaker extends FineryDecorator {

    public Sneaker(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("穿运动鞋");
    }
}
