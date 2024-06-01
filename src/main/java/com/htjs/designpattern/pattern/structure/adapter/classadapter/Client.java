package com.htjs.designpattern.pattern.structure.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        SdCard sdCard = new SdCardImpl();
        computer.readSdCard(sdCard);

        System.out.println("------------------");

        SdCardAdapterTF adapterTF = new SdCardAdapterTF();
        computer.readSdCard(adapterTF);
    }

}
