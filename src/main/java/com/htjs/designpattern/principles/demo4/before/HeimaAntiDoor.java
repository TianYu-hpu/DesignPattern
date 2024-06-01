package com.htjs.designpattern.principles.demo4.before;

public class HeimaAntiDoor implements AntiDoor {
    public void antiThift() {
        System.out.println("防盗");
    }

    public void waterProof() {
        System.out.println("防水");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void function() {
        antiThift();
        waterProof();
        fireProof();
    }
}
