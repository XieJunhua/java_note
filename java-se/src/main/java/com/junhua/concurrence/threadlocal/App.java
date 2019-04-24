package com.junhua.concurrence.threadlocal;

import java.util.concurrent.CountDownLatch;

public class App {

    private static final ThreadLocal<String> name = ThreadLocal.withInitial(() -> {
        System.out.println("init");
        return null;
    });
    private static String name2;

    /**
     * 执行代码会出现name2的值设置的线程和获取的线程不是一个线程
     * 而name则不会出现这种情况
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int parallel = 100;
        CountDownLatch startLatch = new CountDownLatch(1);
        for (int i = 0; i < parallel; i++) {
            new Thread(() -> {
                try {
                    startLatch.await();
                    Thread t = Thread.currentThread();
                    name.set(t + "hello name");
                    name2 = t + "hello name2"; // 多个线程都给name2赋值，写和读的过程是分开的。就导致这里可能出现的thread name和下面打印的不一致。
                    System.out.println(Thread.currentThread() + " " + name.get());// value保存在threadlocal中,保证每个线程的name是一样的，set的线程和get的线程是一致的
                    System.out.println(Thread.currentThread() + " " + name2);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    name.remove();
                }
            }).start();
        }
        startLatch.countDown();

    }
}
