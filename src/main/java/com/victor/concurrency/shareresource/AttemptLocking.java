package com.victor.concurrency.shareresource;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiejunhua on 2017/5/13.
 * 一个操作lock对象，获取等待锁时间的例子
 */
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();

    /**
     * 获取一次，获取不到就放弃
     */
    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    /**
     * 一定的时间内尝试获取锁
     */
    public void timed() {
        boolean captured = false;
        try {
            //两秒钟内一直等待着锁被释放
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("tryLock 2: " + captured);
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        //启动一个线程，一直占据着al这个对象的锁
        new Thread() {
            {
                setDaemon(true);
            }
            @Override
            public void run() {
                super.run();
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
