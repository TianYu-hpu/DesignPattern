package com.htjs.designpattern.pattern.structure.adapter.objectadapter;

public class SdCardImpl implements SdCard {
    public String readSD() {
        System.out.println("SDCard 读取数据");
        return "SDCard 读取数据";
    }

    public void writeSD() {
        System.out.println("SDCard 写数据");
    }
}
