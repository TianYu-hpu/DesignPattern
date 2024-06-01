package com.htjs.designpattern.pattern.structure.decorator;

public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(String desc, float price, FastFood fastFood) {
        super(desc, price);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }


}
