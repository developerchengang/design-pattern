package com.runoob.factory;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
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

}


