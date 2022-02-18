package com.boast.decorator.starter.v1;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearTShirt() {
        System.out.println("穿衬衫");
    }

    public void wearTrouser() {
        System.out.println("穿跨库");
    }

    public void wearSneakers() {
        System.out.println("穿运动鞋");
    }

    public void wearSuit() {
        System.out.println("穿西装");
    }

    public void wearTie() {
        System.out.println("带领带");
    }

    public void wearLeatherShoes() {
        System.out.println("穿皮鞋");
    }

    public void show() {
        System.out.printf("装扮的 %s%n", name);
    }
}
