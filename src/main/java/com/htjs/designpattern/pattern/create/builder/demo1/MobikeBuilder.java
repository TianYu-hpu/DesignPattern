package com.htjs.designpattern.pattern.create.builder.demo1;

public class MobikeBuilder extends Builder {
    public void buildFrame() {
        System.out.println("摩拜自行车车架");
        bike.setFrame("摩拜自行车车架");
    }

    public void buildSeat() {
        System.out.println("摩拜自行车车座");
        bike.setSeat("摩拜自行车车座");
    }

    public Bike createBike() {
        buildFrame();
        buildSeat();
        return bike;
    }
}
