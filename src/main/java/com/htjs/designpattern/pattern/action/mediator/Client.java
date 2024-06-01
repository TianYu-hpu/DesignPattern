package com.htjs.designpattern.pattern.action.mediator;

public class Client {

    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);
        Tenant tenant = new Tenant("李四", mediatorStructure);
        //中介需要知道房主和租客
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);
        tenant.contact("需要租三室的房子");
        houseOwner.contact("我这里有三室的房子，你需要租吗？");
    }

}
