package com.junhua.concurrence.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 通过AtomicReference的方式实现一个简单的自旋锁
 */
public class SpinLockDemo {

    private AtomicReference<Thread> reference = new AtomicReference<>();

    public void lock() {
        System.out.println("try to get lock" + Thread.currentThread());
        while (!reference.compareAndSet(null, Thread.currentThread())) {

        }
        System.out.println("get lock");
    }

    public void unlock() {
        reference.compareAndSet(Thread.currentThread(), null);
        System.out.println("release lock");
    }

    public static void main(String[] args) throws InterruptedException {
        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(() -> {
            spinLockDemo.lock();
            System.out.println("dd");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.unlock();
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            spinLockDemo.lock();
            System.out.println("dd1");
            spinLockDemo.unlock();
        }).start();


    }
}
