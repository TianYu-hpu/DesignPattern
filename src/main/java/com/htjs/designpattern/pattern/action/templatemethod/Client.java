package com.htjs.designpattern.pattern.action.templatemethod;

public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcerateClass_BaoCai();
        abstractClass.cookProcess();
    }

}
