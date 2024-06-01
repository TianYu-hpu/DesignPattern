package com.htjs.designpattern.pattern.action.command;

import java.util.ArrayList;
import java.util.List;

public class Waitor {

    private List<Command> commandList = new ArrayList<Command>();

    public void setCommand(Command command) {
        this.commandList.add(command);
    }

    public void orderUp() {
        System.out.println("订单来了");
        for (Command command : commandList) {
            command.execute();
        }
    }

}
