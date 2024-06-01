package com.htjs.designpattern.principles.demo6;

public class Client {

    public static void main(String[] args) {
        Color color = new RedColor();
        PetroCar car = new PetroCar(color);
        car.move();
    }
}
