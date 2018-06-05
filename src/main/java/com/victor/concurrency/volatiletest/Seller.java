package com.victor.concurrency.volatiletest;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 2018/4/29.
 */
public class Seller {
  private volatile boolean asleep = false;
  private int count = 50;

  public void start() {
    while (!asleep) {

      countSleep();

      System.out.println(count);
    }
  }

  private void countSleep() {

    count--;
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if (count == 0) {
      asleep = true;
    }
  }

  public void shutDown() {
    this.asleep = true;
  }


}
