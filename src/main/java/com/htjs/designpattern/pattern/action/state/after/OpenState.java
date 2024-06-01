package com.htjs.designpattern.pattern.action.state.after;

/**
 * 电梯开启状态类
 */
public class OpenState extends LiftState {

    //当前状态要执行的方法
    public void open() {
        System.out.println("电梯开启。。。");
    }

    public void close() {
        super.context.setLiftState(Context.CLOSE_STATE);
        //调用当前状态中的close方法
        super.context.close();
    }

    public void run() {
        //什么都不做
    }

    public void stop() {
        //什么都不做
    }
}
