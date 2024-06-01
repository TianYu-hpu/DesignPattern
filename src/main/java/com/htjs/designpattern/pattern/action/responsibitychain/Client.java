package com.htjs.designpattern.pattern.action.responsibitychain;

public class Client {

    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 7, "身体不适");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        groupLeader.submit(leaveRequest);
    }

}
