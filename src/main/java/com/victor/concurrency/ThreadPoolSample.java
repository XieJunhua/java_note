package com.victor.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiejunhua on 16/12/22.
 */
//线程可以驱动任务，要想定义任务，只需要实现Runnable接口并编写run()方法
class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++; //用来区分多个任务的实例
    public LiftOff() {

    }
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
    }
    public void run() {
        //run中通常会有某种形式的循环，使得任务一直运行下去直到不再需要。
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

        LiftOff liftOff = new LiftOff();
//        liftOff.run();//这里run不是单独的线程驱动的，而是在main方法中直接调用的(实际上，这里总是分配给main那个线程),所以这里只有等run执行完成了才会执行main方法中的其他代码

        //构造一个新的线程来驱动这个任务，而不是使用main那个线程，所以main方法中的其他代码会直接执行
//        Thread thread = new Thread(liftOff);
//        thread.start();
//        System.out.println("waiting for liftoff...");

        //Executor用来管理Thread对象，简化并发编程。是并发编程中启动任务的首选方法
//        ExecutorService executorService = Executors.newCachedThreadPool(); //
        ExecutorService executorService = Executors.newFixedThreadPool(1); //指定线程池中线程的个数
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();



    }

}
