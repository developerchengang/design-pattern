package com.runoob.absfactory;

public class FactoryProducer {

    public static AbstractFactory createFactory(FactoryType type) {
        AbstractFactory factory = null;

        switch (type) {
            case SHAPE:
                factory = new ShapeFactory();
                break;
            case COLOR:
                factory = new ColorFactory();
                break;
        }

        return factory;
    }

}
