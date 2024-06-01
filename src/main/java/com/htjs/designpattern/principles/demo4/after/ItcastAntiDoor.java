package com.htjs.designpattern.principles.demo4.after;


public class ItcastAntiDoor implements  AntiThift, WaterProof, AntiDoor {
    public void antiThift() {
        System.out.println("防盗");
    }

    public void waterProof() {
        System.out.println("防水");
    }


    public void function() {
        antiThift();
        waterProof();
    }
}
