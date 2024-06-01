package com.htjs.designpattern.pattern.create.abstractfactory;

public class TiramisuDessertFactory implements DessertFactory{


    public Dessert createDessert() {
        System.out.println("创建提拉米苏蛋糕");
        return new Tiramisu();
    }
}
