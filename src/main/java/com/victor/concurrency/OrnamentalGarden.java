package com.victor.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 16/12/26.
 * 21.4.1
 */
public class OrnamentalGarden {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Entrance(i));
        }
        TimeUnit.SECONDS.sleep(3);
        Entrance.cancel();
        exec.shutdown();
        if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)){
            System.out.println("Some tasks were not terminated");
        }
        System.out.println("Total: " + Entrance.getTotalCount());
        System.out.println("sum of: " + Entrance.sumEntrances());
    }
}

class Count {
    private int count = 0;
    private Random random = new Random(47);
    public synchronized int increment(){
        int temp = count;
        if (random.nextBoolean()){
            Thread.yield();
        }
        return (count = ++temp);
    }
    public synchronized int value(){
        return count;
    }
}

/**
 * 模拟公园的入口类
 */
class Entrance implements Runnable {

    private static Count count = new Count(); //总人数
    private static List<Entrance> entrances = new ArrayList<Entrance>();
    private int number = 0; //通过这个入口进入的人数
    private final int id; //入口id
    //volatile一个典型的应用场景,状态标识
    private static volatile boolean canceled = false;
    public static void cancel() {
        canceled = true;
    }

    public Entrance(int id){
        this.id = id;
        entrances.add(this);
    }
    public void run() {
        while (!canceled) {
            synchronized (this) {
                ++number;
            }
//            ++number;
            System.out.println(this + "Total: " + count.increment()); //总人数+1
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("stopping。。" + this);
    }

    public synchronized int getValue(){
        return number;
    }
    public String toString() {
        return "Entrance " + id + ": " + getValue();
    }
    public static int sumEntrances(){
        int sum = 0;
        for (Entrance entrance: entrances){
            sum += entrance.getValue();
        }
        return sum;
    }
    public static int getTotalCount() {
        return count.value();
    }
}
