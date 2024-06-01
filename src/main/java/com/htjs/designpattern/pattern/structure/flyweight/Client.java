package com.htjs.designpattern.pattern.structure.flyweight;

public class Client {

    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox box = boxFactory.getBox("L");
        box.display("红色");
    }

}
