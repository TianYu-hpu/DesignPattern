package com.htjs.designpattern.pattern.structure.decorator;

public class FiredRice extends FastFood {

    public FiredRice() {
        super("炒米", 10);
    }

    public float cost() {
        return this.getPrice();
    }
}
