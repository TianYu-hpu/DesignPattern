package com.htjs.designpattern.pattern.structure.proxy.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(trainStation.getClass());
        enhancer.setCallback(this);
        SellTickets proxyObject = (SellTickets) enhancer.create();
        return proxyObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定的服务费(CgLib动态代理)");
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
