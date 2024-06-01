package com.htjs.designpattern.pattern.create.abstractfactory;

public class ItalyCoffeeAndDessertFactory implements CoffeeAndDessertFactory {
    public Coffee creaateCoffee() {
        return new LatteeCoffeeFactory().createCoffee();
    }

    public Dessert createDesert() {
        return new TiramisuDessertFactory().createDessert();
    }
}
