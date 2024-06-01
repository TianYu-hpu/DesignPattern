package com.htjs.designpattern.pattern.create.prototype.demo1;

public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体的圆形对象创建完成");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体的原型复制成功");
        return (RealizeType) super.clone();
    }
}
