package com.runoob.absfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape createShape(ShapeType type) {
        return null;
    }

    @Override
    public Color createColor(ColorType type) {
        Color color = null;
        switch (type) {
            case RED:
                color = new Red();
                break;
            case GREEN:
                color = new Green();
                break;
            case BLUE:
                color = new Blue();
                break;
        }
        return color;
    }
}
