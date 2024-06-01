package com.htjs.designpattern.pattern.create.abstractfactory;

public class AmericanCoffeeAndDessertFactory implements CoffeeAndDessertFactory {
    public Coffee creaateCoffee() {
        return new AmericanCoffeeFactory().createCoffee();
    }

    public Dessert createDesert() {
        return new MatchaDessertFactory().createDessert();
    }
}
