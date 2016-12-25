package com.victor.concurrency;

/**
 * Created by xiejunhua on 16/12/23.
 */

public class Joining {

    public static void main(String[] args) {
        Sleeper sleeper1 = new Sleeper("sleep1", 1500);
        Sleeper sleeper2 = new Sleeper("sleep2", 1500);

        Joiner joiner1 = new Joiner("join1", sleeper1);
        Joiner joiner2 = new Joiner("join2", sleeper2);

        sleeper2.interrupt();
    }
}

class Sleeper extends Thread{
    private int duration;
    public Sleeper(String name, int duration){
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try{
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println("shut down");
//            e.printStackTrace();
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}

class Joiner extends Thread{
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
    }

    @Override
    public void run(){
        try {
            sleeper.join();//当前线程会被挂起, 直到sleeper这个线程执行完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " join completed");
    }
}
