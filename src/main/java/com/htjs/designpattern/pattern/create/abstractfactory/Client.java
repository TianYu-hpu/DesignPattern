package com.htjs.designpattern.pattern.create.abstractfactory;

public class Client {

    public static void main(String[] args) {
        CoffeeAndDessertFactory coffeeFactory = new AmericanCoffeeAndDessertFactory();
        CoffeeStore coffeeStore = new CoffeeStore(coffeeFactory);
        coffeeStore.order();

    }
}
