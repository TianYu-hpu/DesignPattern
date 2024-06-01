package com.htjs.designpattern.pattern.structure.decorator;

public class FiredNoodles extends FastFood {

    public FiredNoodles() {
        super("炒面", 12);
    }

    public float cost() {
        return this.getPrice();
    }
}
