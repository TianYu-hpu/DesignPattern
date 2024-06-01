package com.htjs.designpattern.pattern.structure.adapter.classadapter;

public class TFCardImpl implements TFCard {
    public String readTF() {
        System.out.println("TFCard 读取数据");
        return "TFCard 读取数据";
    }

    public void writeTF() {
        System.out.println("TFCard 写数据");
    }
}
