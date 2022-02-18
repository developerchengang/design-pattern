package com.boast.decorator.ultimate;

public class Client {

    public static void main(String[] args) {
        Person leatherShoes = new LeatherShoes();
        Person sneaker = new Sneaker(leatherShoes);
        Person tShirt = new TShirt(sneaker);
        tShirt.show();
    }

}
