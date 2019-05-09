package com.junhua.concurrence.readwritelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiejunhua on 2018/4/26.
 */
public class TestInfo {

  public static void main(String[] args) {
    A a = new A();
   for(int i = 0; i < 50; i++) {
     new Thread(() -> {
       a.method1();
     }).start();
   }
  }

}


class A{
  int a = 1;
  Lock lock = new ReentrantLock();
  public void method1() {
    System.out.println("pre: " + a);
    lock.lock();
    a++;
    lock.unlock();

    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("pro: " + a);


  }
}
