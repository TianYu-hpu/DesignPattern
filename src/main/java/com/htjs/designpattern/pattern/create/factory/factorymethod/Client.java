package com.htjs.designpattern.pattern.create.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        CoffeeStore coffeeStore = new CoffeeStore(coffeeFactory);
        coffeeStore.orderCoffee();

    }
}
