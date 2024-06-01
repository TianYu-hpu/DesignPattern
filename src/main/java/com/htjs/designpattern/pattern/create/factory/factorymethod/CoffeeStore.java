package com.htjs.designpattern.pattern.create.factory.factorymethod;

public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        return coffeeFactory.createCoffee();
    }


}
