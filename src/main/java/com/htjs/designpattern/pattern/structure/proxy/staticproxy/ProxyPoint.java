package com.htjs.designpattern.pattern.structure.proxy.staticproxy;

public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    public void sell() {
        System.out.println("代售点售票加收一部分服务费");
        trainStation.sell();
    }
}
