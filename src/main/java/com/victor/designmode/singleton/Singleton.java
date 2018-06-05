package com.victor.designmode.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiejunhua on 2018/5/15.
 */
public class Singleton {
  private Singleton() {

  }

  private static Singleton singleton;

  public static Singleton getSingleton() {
    if (singleton == null) {
      synchronized (Singleton.class) {
        if (singleton == null) {
          singleton = new Singleton();
        }
      }
    }
    return singleton;
  }

  public static void main(String[] args) {
    Lock lock = new ReentrantLock();
    lock.lock();

    Singleton.getSingleton();
  }
}
