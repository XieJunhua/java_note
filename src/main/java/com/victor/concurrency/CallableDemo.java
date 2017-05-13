package com.victor.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by xiejunhua on 16/12/23.
 */

/**
 * 21.2.4
 * Runnable是执行工作的独立任务,不提供返回值。要想在任务完成时有返回值,则要实现Callable接口
 * 一个Callable使用的简单例子
 */
class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    //在Callable接口中定义的call方法和在Runnable中定义的run方法类似
    public String call() throws Exception {

        return Thread.currentThread().getName() + " result of TaskWIthResult" + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

//        TaskWithResult t1 = new TaskWithResult(1);
        for (int i = 0; i < 10; i++) {
            //这里要用exec.submit(Callable instance),区别于exec.execute(Runnable command)
            //任务返回的结果封装在Feature中。泛型类型String为Callable实现类中重写的call方法的返回值类型
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs: results) {
            try{
                if (fs.isDone()) {//判断是否任务完成。
                    System.out.println(fs.get());
                }
//                System.out.println(fs.get()); //也可以不判断任务是否完成，fs.get()会堵在那里,直到任务完成，拿到返回值。

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }

    }
}
