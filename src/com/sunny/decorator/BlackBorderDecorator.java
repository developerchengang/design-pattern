package com.sunny.decorator;

/**
 * 黑色边框装饰类：具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
