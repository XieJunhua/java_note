package com.victor.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiejunhua on 16/12/22.
 */
class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {

    }
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }
    public void run() {
        while (countDown-- >0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}

/**
 * Executor用来管理Thread对象,简化并发编程
 */
public class ThreadPoolSample{
    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newCachedThreadPool(); //
        ExecutorService executorService = Executors.newFixedThreadPool(1); //指定线程池中线程的个数
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();

    }

}
