package com.boast.decorator.ultimate;

public class LeatherShoes extends FineryDecorator {

    @Override
    public void show() {
        super.show();
        System.out.println("穿皮鞋");
    }
}
