package com.boast.decorator.ultimate;

public class FineryDecorator implements Person {

    private Person person;

    public FineryDecorator() {}

    public FineryDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
