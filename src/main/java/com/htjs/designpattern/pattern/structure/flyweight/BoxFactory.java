package com.htjs.designpattern.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {

    private static Map<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.instance;
    }

    private static final class SingletonHolder {
        private static final BoxFactory instance = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
