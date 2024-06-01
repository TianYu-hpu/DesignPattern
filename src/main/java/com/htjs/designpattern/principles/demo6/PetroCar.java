package com.htjs.designpattern.principles.demo6;

public class PetroCar extends Car {

    public PetroCar(Color color) {
        this.color = color;
    }

    void move() {
        System.out.println(color.getColor() +" 颜色汽油车正在奔跑");
    }
}
