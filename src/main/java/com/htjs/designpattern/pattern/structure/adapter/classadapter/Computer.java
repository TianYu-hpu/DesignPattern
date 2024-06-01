package com.htjs.designpattern.pattern.structure.adapter.classadapter;

public class Computer {

    public String readSdCard(SdCard sdcard) {
        return sdcard.readSD();
    }

}
