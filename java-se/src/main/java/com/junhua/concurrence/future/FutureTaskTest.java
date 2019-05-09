package com.junhua.concurrence.future;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskTest {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(() -> {
            System.out.println("thread name + " + Thread.currentThread());
            TimeUnit.SECONDS.sleep(10);
            return "done";
        });
        new Thread(() -> {
            futureTask.run();
        }).start();
        System.out.println(Thread.currentThread());
        System.out.println("dd");
        try {
            System.out.println("start get result: " + System.currentTimeMillis());
            System.out.println(futureTask.get());
            System.out.println("finish get result: " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
