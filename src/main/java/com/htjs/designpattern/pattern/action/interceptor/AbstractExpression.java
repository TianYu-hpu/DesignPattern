package com.htjs.designpattern.pattern.action.interceptor;

/**
 * @version v1.0
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式类
 * @Author: TianYu
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
