package com.htjs.designpattern.principles.demo4.before;

public class ItcastAntiDoor implements AntiDoor {
    public void antiThift() {
        System.out.println("防盗");
    }

    public void waterProof() {
        System.out.println("防水");
    }

    public void fireProof() {

    }

    public void function() {
        antiThift();
        waterProof();
        fireProof();
    }
}
