package com.htjs.designpattern.pattern.structure.adapter.objectadapter;

public class SdCardAdapterTF implements SdCard {

    private TFCard tfCard;

    public SdCardAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("Adapter 读取 TFCard");
        return tfCard.readTF();
    }

    public void writeSD() {
        System.out.println("Adapter 写数据到 TFCard");
        tfCard.writeTF();
    }
}
