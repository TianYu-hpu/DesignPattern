package com.htjs.designpattern.pattern.structure.decorator;

public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super("培根", 2, fastFood);
    }

    public float cost() {
        return super.getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
