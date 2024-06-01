package com.htjs.designpattern.pattern.action.state.before;

public interface ILift {

    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPING_STATE = 4;

    //设置电梯状态的功能
    void setState(int state);

    void open();

    void close();

    void run();

    void stop();


}
