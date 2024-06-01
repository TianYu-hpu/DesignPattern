package com.htjs.designpattern.pattern.create.prototype.demo2;

public class Citation implements Cloneable {

    private String name;

    public Citation(String name) {
        System.out.println("原型对象创建成功");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学获得三好学生奖状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        System.out.println("原型对象复制成功");
        return (Citation) super.clone();
    }
}
