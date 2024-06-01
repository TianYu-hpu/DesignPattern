package com.htjs.designpattern.pattern.create.prototype.demo2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation("张三");
        Citation citation2 = citation1.clone();
        System.out.println("citation11 == citation2:" + (citation1 == citation2));
        citation2.setName("李四");
        System.out.println("citation11 == citation2:" + (citation1 == citation2));
        citation1.show();
        citation2.show();

    }

}
