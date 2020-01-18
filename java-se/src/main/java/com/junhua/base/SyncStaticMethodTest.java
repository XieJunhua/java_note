package com.junhua.base;

import java.util.concurrent.TimeUnit;

/**
 * @author junhua xjhclks@163.com
 * @date 2019/10/10 12:18 PM
 */
public class SyncStaticMethodTest {

  public static void main(String[] args) {
    new Thread(() -> SyncStaticMethodTest.methodA()).start();
    methodA();

  }

  public synchronized static void methodA() {

    System.out.println("haha" + Thread.currentThread().getName());
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("release thread");
  }
}
