package com.htjs.designpattern.pattern.structure.decorator;

public class Client {

    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FiredRice();
        //花费的价格
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("========");
        //点一份加鸡蛋的炒饭
        FastFood food1 = new FiredRice();
        food1 = new Egg(food1);
        //花费的价格
        System.out.println(food1.getDesc() + " " + food1.cost() + "元");
        System.out.println("========");
        //点一份加培根的炒面
        FastFood food2 = new FiredNoodles();
        food2 = new Bacon(food2);
        food2 = new Egg(food2);
        //花费的价格
        System.out.println(food2.getDesc() + " " + food2.cost() + "元");
    }
}
