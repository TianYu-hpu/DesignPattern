package com.htjs.designpattern.pattern.create.builder.demo1;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        director.build();
    }
}
