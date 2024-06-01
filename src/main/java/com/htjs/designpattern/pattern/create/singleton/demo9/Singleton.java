package com.htjs.designpattern.pattern.create.singleton.demo9;

/**
 * 防止序列化/反序列化实现
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    private Object readResolve() {
        return instance;
    }
}
