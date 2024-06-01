package com.htjs.designpattern.pattern.action.command;

import java.util.Map;

public class OrderCommand implements Command{

    private SeniorChef seniorChef;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    public SeniorChef getSeniorChef() {
        return seniorChef;
    }

    public void setSeniorChef(SeniorChef seniorChef) {
        this.seniorChef = seniorChef;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDiningTable() + "桌下单了");
        for (Map.Entry<String, Integer> entry : order.getFoodDir().entrySet()) {
            seniorChef.makeFood(entry.getKey(), entry.getValue());
        }
        System.out.println(order.getDiningTable() + "桌准备完毕了");
    }
}
