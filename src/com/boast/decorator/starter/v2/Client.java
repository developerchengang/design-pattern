package com.boast.decorator.starter.v2;

public class Client {

    public static void main(String[] args) {
        Person person = new Person("豆豆");
        System.out.println("第一种打扮：");
        Finery tShirt = new TShirt();
        Finery trouser = new Trouser();
        Finery sneakers = new Sneakers();

        tShirt.show();
        trouser.show();
        sneakers.show();
        person.show();

        System.out.println("第二种打扮：");
        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();

        suit.show();
        tie.show();
        leatherShoes.show();
        person.show();
    }

}
