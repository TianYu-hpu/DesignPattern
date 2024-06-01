package com.htjs.designpattern.pattern.create.builder.demo2;

public class Client {

    public static void main(String[] args) {
        Phone.Builder builder = new Phone.Builder().cpu("高通").memory("三星").hardDisk("长城");
        Phone phone = builder.build();
        System.out.println(phone.toString());
    }
}
