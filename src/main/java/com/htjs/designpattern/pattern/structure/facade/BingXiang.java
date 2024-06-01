package com.htjs.designpattern.pattern.structure.facade;

public class BingXiang implements JiaDian {
    public void on() {
        System.out.println("冰箱打开");
    }

    public void off() {
        System.out.println("冰箱关闭");
    }
}
