package com.htjs.designpattern.principles.demo2.after;

public class RectangleDemo {

    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printWidthAndLength(Quadrilateral quadrilateral) {
        System.out.println("width:" + quadrilateral.getWidth());
        System.out.println("length:" + quadrilateral.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        printWidthAndLength(rectangle);

        Square square = new Square();
        square.setSide(10);
//        resize(square);
        printWidthAndLength(square);
    }


}
