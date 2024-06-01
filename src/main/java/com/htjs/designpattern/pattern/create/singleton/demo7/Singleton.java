package com.htjs.designpattern.pattern.create.singleton.demo7;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static final class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
