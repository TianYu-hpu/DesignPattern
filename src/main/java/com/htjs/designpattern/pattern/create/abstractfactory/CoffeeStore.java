package com.htjs.designpattern.pattern.create.abstractfactory;

public class CoffeeStore {

    private CoffeeAndDessertFactory coffeeFactory;

    public CoffeeStore(CoffeeAndDessertFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void order() {
        coffeeFactory.creaateCoffee();
        coffeeFactory.createDesert();
    }


}
