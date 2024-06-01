package com.htjs.designpattern.pattern.create.builder.demo1;

public class OfoBuilder extends Builder {
    public void buildFrame() {
        System.out.println("Ofo自行车车架");
        bike.setFrame("Ofo自行车车架");
    }

    public void buildSeat() {
        System.out.println("Ofo自行车车座");
        bike.setSeat("Ofo自行车车座");
    }

    public Bike createBike() {
        buildFrame();
        buildSeat();
        return bike;
    }
}
