package com.htjs.designpattern.principles.demo2.before;

public class RectangleDemo {

    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printWidthAndLength(Rectangle rectangle) {
        System.out.println("width:" + rectangle.getWidth());
        System.out.println("length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        printWidthAndLength(rectangle);

        Rectangle square = new Square();
        square.setWidth(10);
        resize(square);
        printWidthAndLength(square);
    }


}
