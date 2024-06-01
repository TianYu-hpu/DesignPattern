package com.htjs.designpattern.pattern.structure.bridge;

public class Client {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Linux(new AVIVideoFile());
        operatingSystem.play("三体");
    }
}
