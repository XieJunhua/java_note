package com.junhua.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 16/12/23.
 */

//后台线程和非后台线程。当所有非后台线程结束时，后台线程就会被强行杀掉,程序终止。main这种就是非后台线程
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread thread = new Thread(new Adaemon());
//        thread.setDaemon(true); //当设置成后台线程的时候finally不会被执行,因为main执行完了就会杀这个线程
        thread.start();
    }
}

class Adaemon implements Runnable{

    public void run() {
        try {
            System.out.println("start ");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e){
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
    }
}
