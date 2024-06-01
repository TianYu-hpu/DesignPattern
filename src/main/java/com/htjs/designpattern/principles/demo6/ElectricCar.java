package com.htjs.designpattern.principles.demo6;

public class ElectricCar extends Car {

    public ElectricCar(Color color) {
        this.color = color;
    }

    void move() {
        System.out.println(color.getColor() +" 颜色电车正在奔跑");
    }
}
