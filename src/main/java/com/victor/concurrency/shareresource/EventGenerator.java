package com.victor.concurrency.shareresource;

/**
 * Created by xiejunhua on 16/12/23.
 */
public class EventGenerator extends IntGenerator {
    private int currentEventValue = 0;
    @Override
    public int next() { //在该方法上加 synchronized关键字可以解决并发带来的安全问题。synchronized修饰方法,该方法同一时刻只能被一个线程访问。
        ++currentEventValue;//在java中++不是原子操作,先把这个值+1,然后赋给原来的变量,value++等价于value = value + 1(这里不讨论++在前,还是++在后的问题)
//        Thread.yield();
        ++currentEventValue;
        return currentEventValue;
    }

    public static void main(String[] args) {
        EventChecker.test(new EventGenerator(), 10);
    }
}
