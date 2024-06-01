package com.htjs.designpattern.pattern.action.interceptor;

public class Variable extends AbstractExpression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
