package com.htjs.designpattern.principles.demo1;

/**
 * 开闭原则
 */
public class SogouInputMethod {

    private AbstractSkin abstractSkin;

    public AbstractSkin getAbstractSkin() {
        return abstractSkin;
    }

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display() {
        abstractSkin.display();
    }

    public static void main(String[] args) {
        SogouInputMethod sogouInputMethod = new SogouInputMethod();
        //DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        sogouInputMethod.setAbstractSkin(skin);
        sogouInputMethod.display();
    }
}
