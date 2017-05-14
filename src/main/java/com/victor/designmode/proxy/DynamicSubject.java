package com.victor.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xiejunhua on 2017/5/14.
 * 动态代理类
 */
public class DynamicSubject implements InvocationHandler {

    private Object sub;

    public DynamicSubject(Object o) {
        this.sub = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before call " + method);
        method.invoke(sub, args);
        System.out.println("after call " + method);
        return null;
    }
}
