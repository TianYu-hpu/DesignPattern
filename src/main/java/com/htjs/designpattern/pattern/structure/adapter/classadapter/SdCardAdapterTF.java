package com.htjs.designpattern.pattern.structure.adapter.classadapter;

public class SdCardAdapterTF extends TFCardImpl implements SdCard{


    public String readSD() {
        System.out.println("Adapter 读取 TFCard");
        return readTF();
    }

    public void writeSD() {
        System.out.println("Adapter 写数据到 TFCard");
        writeTF();
    }
}
