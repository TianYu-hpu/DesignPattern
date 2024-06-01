package com.htjs.designpattern.pattern.structure.flyweight;

public abstract class AbstractBox {

    private String shape;

    public AbstractBox(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void display(String color) {
        System.out.println("方块形状:" + this.getShape() + "颜色:" + color);
    }

}
