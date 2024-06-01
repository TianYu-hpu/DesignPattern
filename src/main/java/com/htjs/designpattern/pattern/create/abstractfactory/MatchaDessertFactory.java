package com.htjs.designpattern.pattern.create.abstractfactory;

public class MatchaDessertFactory implements DessertFactory{


    public Dessert createDessert() {
        System.out.println("创建提抹茶蛋糕");
        return new MatchaMousse();
    }
}
