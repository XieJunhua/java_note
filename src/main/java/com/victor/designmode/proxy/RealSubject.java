package com.victor.designmode.proxy;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject want to do sth");
    }
}
