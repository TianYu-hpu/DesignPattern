package com.htjs.designpattern.pattern.create.factory.factorymethod;

public class LatteeCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        System.out.println("拿铁咖啡");
        return new LatteCoffee();
    }
}
