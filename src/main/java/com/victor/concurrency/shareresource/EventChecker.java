package com.victor.concurrency.shareresource;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiejunhua on 16/12/23.
 */
public class EventChecker implements Runnable {
    private IntGenerator intGenerator;
    private final int id;

    public EventChecker(IntGenerator intGenerator, int id){
        this.id = id;
        this.intGenerator = intGenerator;
    }
    public void run() {
        while (!intGenerator.isCanceled()){
            int val = intGenerator.next();
            if (val % 2 != 0){//当val为奇数的时候,执行下面的输出,并更改cancel字段
                System.out.println(val + " not event");
                intGenerator.cancel();
            }
        }
    }

    public static void test(IntGenerator intGenerator, int count){
        System.out.println("press control-c to exit");
        ExecutorService executorService = Executors.newCachedThreadPool();
        //多个线程共享intGenerator对象。验证资源共享时出现并发安全的问题
        for (int i = 0; i < count; i++) {
            executorService.execute(new EventChecker(intGenerator, i));
        }
        executorService.shutdown();
    }
}
