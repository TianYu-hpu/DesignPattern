package com.htjs.designpattern.pattern.create.abstractfactory;

public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        System.out.println("美式咖啡");
        return new AmericanCoffee();
    }
}
