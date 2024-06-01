package com.htjs.designpattern.pattern.structure.facade;

public class AC implements JiaDian {
    public void on() {
        System.out.println("空调打开");
    }

    public void off() {
        System.out.println("空调关闭");
    }
}
