package com.htjs.designpattern.pattern.create.prototype.demo3;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Student clone() throws CloneNotSupportedException {
        System.out.println("原型对象复制成功");
        return (Student) super.clone();
    }
}
