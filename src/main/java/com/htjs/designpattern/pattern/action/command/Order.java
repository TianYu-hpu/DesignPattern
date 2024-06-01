package com.htjs.designpattern.pattern.action.command;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private int dinningTable;
    private Map<String, Integer> foodDir = new HashMap<String, Integer>();

    public int getDiningTable() {
        return dinningTable;
    }

    public void setDiningTable(int dinningTable) {
        this.dinningTable = dinningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        this.foodDir.put(name, num);
    }
}
