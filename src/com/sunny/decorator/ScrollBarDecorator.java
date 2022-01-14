package com.sunny.decorator;

/**
 * 滚动条装饰类：具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setScrollBar();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
