package com.runoob.absfactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.createFactory(FactoryType.SHAPE);
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.createFactory(FactoryType.COLOR);
        Color blue = colorFactory.createColor(ColorType.BLUE);
        blue.fill();

    }

}
