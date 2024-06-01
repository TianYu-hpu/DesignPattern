package com.htjs.designpattern.pattern.create.builder.demo1;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike build() {
        return builder.createBike();
    }
}
