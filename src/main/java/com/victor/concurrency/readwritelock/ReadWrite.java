package com.victor.concurrency.readwritelock;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xiejunhua on 2018/4/26.
 *
 */
public class ReadWrite {
  private Object data = null;
  ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

  public void get() {
    System.out.println("方法调用，没有获取到读锁");
    readWriteLock.readLock().lock();
    System.out.println("获取到读锁，开始执行");
    try {
      System.out.println(Thread.currentThread().getName() + " 准备读取数据!");
      Thread.sleep((long)(Math.random() * 1000));
//      Thread.sleep(10 * 1000);
      System.out.println(Thread.currentThread().getName() + " 读出的数据为: " + data);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      readWriteLock.readLock().unlock();
    }
  }

  /**
   * 在写的时候不能进行读操作和另外的读操作；获取写锁自后，无法再获取读锁和写锁
   * @param data
   */
  public void put(Object data) {
    readWriteLock.writeLock().lock();
    try {
      System.out.println(Thread.currentThread().getName() + " 准备写数据");
      Thread.sleep((long)(Math.random() * 5000));
//      Thread.sleep(5 * 1000);
      this.data = data;
      System.out.println(Thread.currentThread().getName() + " 写入的数据为: " + data);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      readWriteLock.writeLock().unlock();
    }

  }

  public static void main(String[] args) {

  }

}
