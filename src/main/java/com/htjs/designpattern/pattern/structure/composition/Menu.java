package com.htjs.designpattern.pattern.structure.composition;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList;



    public Menu(String name, int level) {
        super(name, level);
        this.menuComponentList = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void getChild(int level) {
        menuComponentList.get(level);
    }

    public void print() {
        for (int i = 1; i < getLevel(); i++) {
            System.out.print("--");
        }
        System.out.println(getName());
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
