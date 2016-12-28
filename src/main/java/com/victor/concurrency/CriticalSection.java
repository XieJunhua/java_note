package com.victor.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xiejunhua on 16/12/25.
 */
public class CriticalSection {
    static void testApproaches(PairManager pman1, PairManager pman2){
        ExecutorService exec = Executors.newCachedThreadPool();
        PairManipulator pm1 = new PairManipulator(pman1);
        PairManipulator pm2 = new PairManipulator(pman2);
        PairChecker pchecker1 = new PairChecker(pman1);
        PairChecker pChecker2 = new PairChecker(pman2);
        exec.execute(pm1);
        exec.execute(pm2);
        exec.execute(pchecker1);
        exec.execute(pChecker2);


        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pm1: " + pm1 + "\n pm2: " + pm2);
        //输出的结果可以得出,synchronized对整个方法加锁对比对部分代码加锁,后者对象不加锁的时间更长。
        //我们在进行加锁的时候尽量采用对代码块进行加锁
        System.exit(0); //退出当前程序
    }

    public static void main(String[] args) {
        PairManager pman1 = new PairManager1();
        PairManager pman2 = new PairManager2();
        testApproaches(pman1, pman2);
    }
}

//一个线程不安全的类
class Pair{
    private int x;
    private int y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Pair(){
        this(0,0);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void incrementX(){
        x++;
    }
    public void incrementY(){
        y++;
    }
    public String toString(){
        return "x: " + x + "y: " + y;
    }
    public class PairValuesNotEqualException extends RuntimeException{

        public PairValuesNotEqualException(){
            super("Pair vlaues not equals: " + Pair.this);
        }
    }

    /**
     * 检查线程x,y的状态,如果不一致,则可以判断为出现了线程安全问题
     */
    public void checkState(){
        if (x != y){
            System.out.println(" error");
            throw new PairValuesNotEqualException();
        }
    }
}

//Pair类是一个线程不安全的类,PairManager持有一个Pair对象,并控制对他的一切访问
abstract class PairManager{
    AtomicInteger checkCounter = new AtomicInteger(0);
    protected Pair p = new Pair();
    //如果创建一个线程安全的ArrayList
    private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
    public synchronized Pair getPair(){
        return new Pair(p.getX(), p.getY());
    }
    public void store(Pair p){
        storage.add(p);
        try{
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public abstract void increment();
}

//synchronized修饰方法,对整个方法加锁
class PairManager1 extends PairManager{
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(p);
    }
}

//synchronized对可能造成线程安全问题的代码块进行加锁
class PairManager2 extends PairManager{
    public void increment() {
        Pair temp;
        synchronized (this){
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}

class PairManipulator implements Runnable{

    private PairManager pm;
    public PairManipulator(PairManager pm){
        this.pm = pm;
    }

    public void run() {
        while (true){
            pm.increment();
        }
    }
    public String toString(){
        return "Pair: " + pm.getPair() + "checkCounter = " + pm.checkCounter.get();
    }
}

class PairChecker implements Runnable{

    private PairManager pm;
    public PairChecker(PairManager pm){
        this.pm = pm;
    }
    public void run() {
        while (true){
            pm.checkCounter.incrementAndGet();
            pm.getPair().checkState();
        }
    }
}



