package com.htjs.designpattern.pattern.structure.decorator;

public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super("鸡蛋", 1, fastFood);
    }

    public float cost() {
        return super.getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
