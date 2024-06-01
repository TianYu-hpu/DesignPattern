package com.htjs.designpattern.pattern.create.prototype.demo4;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {

    private Student stu;

    public Citation(Student stu) {
        System.out.println("原型对象创建成功");
        this.stu = stu;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学获得三好学生奖状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        System.out.println("原型对象复制成功");
        return (Citation) super.clone();
    }
}
