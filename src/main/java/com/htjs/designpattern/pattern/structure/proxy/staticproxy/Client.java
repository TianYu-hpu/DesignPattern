package com.htjs.designpattern.pattern.structure.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
