package com.htjs.designpattern.pattern.create.singleton.demo10;

/**
 * 防止通过反射
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        if(instance != null) {
            throw new RuntimeException("不能重复创建");
        }
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
}
