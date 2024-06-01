package com.htjs.designpattern.pattern.structure.facade;

public class Light implements JiaDian {
    public void on() {
        System.out.println("灯打开");
    }

    public void off() {
        System.out.println("灯关闭");
    }
}
