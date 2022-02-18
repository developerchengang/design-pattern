package com.boast.decorator.starter.v2;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("装扮的 %s%n", name);
    }
}
