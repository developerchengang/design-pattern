package com.runoob.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();

        // 创建原始的数据源:

        try {
            InputStream fis = new FileInputStream("test.gz");
            // 增加缓冲功能:
            InputStream bis = new BufferedInputStream(fis);
            // 增加解压缩功能:
            InputStream gis = new GZIPInputStream(bis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
