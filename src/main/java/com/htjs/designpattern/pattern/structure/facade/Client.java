package com.htjs.designpattern.pattern.structure.facade;

public class Client {

    public static void main(String[] args) {
        SmartApplicatioinFacade smartApplicatioinFacade = new SmartApplicatioinFacade();
        smartApplicatioinFacade.addJianDian(new Light());
        smartApplicatioinFacade.addJianDian(new Light());
        smartApplicatioinFacade.addJianDian(new BingXiang());
        smartApplicatioinFacade.addJianDian(new AC());
        smartApplicatioinFacade.say("打开所有电器");
    }


}
