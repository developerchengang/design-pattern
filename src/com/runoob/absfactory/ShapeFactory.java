package com.runoob.absfactory;


public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape createShape(ShapeType type) {
        Shape shape = null;
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case SQUARE:
                shape = new Square();
                break;
        }
        return shape;
    }

    @Override
    public Color createColor(ColorType type) {
        return null;
    }
}


