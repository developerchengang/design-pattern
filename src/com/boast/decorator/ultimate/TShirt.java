package com.boast.decorator.ultimate;

public class TShirt extends FineryDecorator {

    public TShirt(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("穿衬衫");
    }
}
