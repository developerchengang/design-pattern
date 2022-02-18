package com.boast.decorator.starter.v1;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("豆豆");
        System.out.println("第一种打扮：");
        person.wearTShirt();
        person.wearTrouser();
        person.wearSneakers();
        person.show();

        System.out.println("第二种打扮：");
        person.wearSuit();
        person.wearTie();
        person.wearLeatherShoes();
        person.show();
    }
}
