package com.junhua.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiejunhua on 2017/5/13.
 */
public class SimpelPriorities implements Runnable {
    private int countDown = 5;
    private int priority;
    private volatile double d;

    public SimpelPriorities() {

    }
    public SimpelPriorities(int priority) {
        this.priority = priority;
    }
    public String toString() {
        return Thread.currentThread().toString() + ": " + countDown;
    }
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double)i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }

    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimpelPriorities(Thread.MIN_PRIORITY));



        }
        exec.execute(new SimpelPriorities(Thread.MAX_PRIORITY));
        exec.shutdown();

    }
}
