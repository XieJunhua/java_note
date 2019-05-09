package com.junhua.concurrence.shareresource;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiejunhua on 16/12/23.
 * 显式的使用lock对象的例子。lock可以方便灵活的控制锁
 * 优点:一旦程序发生异常时，可以使用finally子句将系统维护在正常状态。这点synchronized关键字做不到。
 */
public class MutexEventGenerator extends IntGenerator{
    private int currentEventValue = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEventValue;
        Thread.yield();
            ++currentEventValue;
            return currentEventValue;

        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        EventChecker.test(new MutexEventGenerator(), 10);
    }
}
