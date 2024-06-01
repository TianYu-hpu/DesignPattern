package com.htjs.designpattern.pattern.structure.composition;

public class MenuItem extends MenuComponent{
    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 1; i < getLevel(); i++) {
            System.out.print("--");
        }
        System.out.println(getName());
    }
}
