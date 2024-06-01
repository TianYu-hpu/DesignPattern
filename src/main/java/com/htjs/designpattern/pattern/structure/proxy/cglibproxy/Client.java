package com.htjs.designpattern.pattern.structure.proxy.cglibproxy;

public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();

        SellTickets sellTickets = factory.getProxyObject();
        sellTickets.sell();
    }
}
