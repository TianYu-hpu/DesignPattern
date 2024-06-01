package com.htjs.designpattern.principles.demo4.before;

/**
 * 接口隔离原则
 */
public class Demo {

    public static void main(String[] args) {
        AntiDoor antiDoor = new HeimaAntiDoor();
        antiDoor.function();

        AntiDoor itcastDoor = new ItcastAntiDoor();
        itcastDoor.function();
    }
}
