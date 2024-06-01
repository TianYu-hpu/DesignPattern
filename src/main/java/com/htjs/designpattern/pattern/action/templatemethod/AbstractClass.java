package com.htjs.designpattern.pattern.action.templatemethod;

public abstract class AbstractClass {

    public final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.portSauge();
        this.fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void portSauge();

    public void fry() {
        System.out.println("炒菜");
    }

}
