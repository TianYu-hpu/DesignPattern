package com.htjs.designpattern.pattern.action.interceptor;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }

}
