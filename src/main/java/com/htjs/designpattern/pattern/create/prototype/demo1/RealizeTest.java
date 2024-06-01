package com.htjs.designpattern.pattern.create.prototype.demo1;

public class RealizeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType r1 = new RealizeType();
        RealizeType r2 = r1.clone();
        System.out.println("r1 == r2:" + (r1 == r2));
    }
}
