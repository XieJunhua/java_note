package com.junhua.design.pattern.singleton;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 7:22 AM
 * 最基础的单例模式，实现起来简单，但是在高并发的情况下发不能保证线程安全，使用的时候要谨慎
 */
public class Singleton1 {
  private static Singleton1 INSTANCE = null;
  private Singleton1() {

  }
  public static Singleton1 getSingleton() {
    if (INSTANCE == null) {
      Thread.yield();
      INSTANCE = new Singleton1();
      Thread.yield();
    }
    return INSTANCE;
  }


}
