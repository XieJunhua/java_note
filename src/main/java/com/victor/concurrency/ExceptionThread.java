package com.victor.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiejunhua on 2017/5/13.
 * 并发编程中异常捕获的例子
 */
public class ExceptionThread implements Runnable{

    public void run() {
        throw new RuntimeException("hahaha this is a exception");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            executorService.execute(new ExceptionThread());
            executorService.shutdown();
        } catch (Exception e) {
            System.out.println("execute catch");
            e.printStackTrace();
        }
    }
}
