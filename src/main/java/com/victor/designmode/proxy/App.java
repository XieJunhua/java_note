package com.victor.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by xiejunhua on 2017/5/14.
 * 代理模式: 为其他对象提供一种代理，以控制对这个对象的访问。[为了控制对真实对象的访问]
 */
public class App {
    public static void main(String[] args) {
//        Subject subject = new ProxySubject();
//        subject.request();


        //动态代理,client调用
        RealSubject subject1 = new RealSubject();
        InvocationHandler invocationHandler = new DynamicSubject(subject1);

        Subject subject2 = (Subject)Proxy.newProxyInstance(subject1.getClass().getClassLoader(), subject1.getClass().getInterfaces(), invocationHandler);
        subject2.request();

    }
}
