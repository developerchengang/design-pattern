package com.runoob.absfactory;

public abstract class AbstractFactory {

    public abstract Shape createShape(ShapeType type);

    public abstract Color createColor(ColorType type);

}
