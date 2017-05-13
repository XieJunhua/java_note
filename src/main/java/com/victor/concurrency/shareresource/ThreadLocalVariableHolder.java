package com.victor.concurrency.shareresource;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 2017/5/13.
 * ThreadLocal 通常当做静态域存储。
 * 线程本地存储，可以为使用相同变量的每个不同的线程创建不同的存储。
 */
public class ThreadLocalVariableHolder {
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
        private Random rand = new Random(49);
        protected synchronized Integer initialValue() {
            return rand.nextInt(10000);
        }
    };

    public static void increment() {
        value.set(value.get() + 1);
    }
    public static int get() {
        return value.get();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Accessor(i));
        }
        try {
            TimeUnit.SECONDS.sleep(3);
            executorService.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}

class Accessor implements Runnable {

    private final int id;

    public Accessor(int id) {
        this.id = id;
    }
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }

    }

    @Override
    public String toString() {
        return "#" + id + ": " + ThreadLocalVariableHolder.get();
    }
}
