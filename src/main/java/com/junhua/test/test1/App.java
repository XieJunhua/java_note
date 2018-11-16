package com.junhua.test.test1;

/**
 * Created by xiejunhua on 2018/4/30.
 */
public class App {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      System.out.println(" this is t1");
    });

    Thread t2 = new Thread(() -> {
      try {
        t1.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("this is t2");
    });

    Thread t3 = new Thread(() -> {
      try {
        t2.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("this is t3");
    });

    t3.start();
    t2.start();
    t1.start();

  }
}
