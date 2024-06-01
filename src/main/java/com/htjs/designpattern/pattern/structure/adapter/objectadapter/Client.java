package com.htjs.designpattern.pattern.structure.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        SdCard sdCard = new SdCardImpl();
        computer.readSdCard(sdCard);

        System.out.println("------------------");
        TFCard tfCard = new TFCardImpl();
        SdCardAdapterTF adapterTF = new SdCardAdapterTF(tfCard);
        computer.readSdCard(adapterTF);

    }

}
