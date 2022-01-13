package com.runoob.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape(ShapeType.RECTANGLE);
        shape.draw();
    }

}
