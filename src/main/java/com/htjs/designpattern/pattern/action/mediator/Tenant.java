package com.htjs.designpattern.pattern.action.mediator;

public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租客" + name + "获得到消息:" + message);
    }
}
