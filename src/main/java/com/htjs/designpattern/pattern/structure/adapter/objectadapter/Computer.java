package com.htjs.designpattern.pattern.structure.adapter.objectadapter;

public class Computer {

    public String readSdCard(SdCard sdcard) {
        return sdcard.readSD();
    }

}
