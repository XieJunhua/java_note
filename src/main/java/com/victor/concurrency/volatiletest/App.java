package com.victor.concurrency.volatiletest;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 2018/4/29.
 */
public class App {


  public static void main(String[] args) {
    Seller seller = new Seller();
    new Thread(() -> {
      seller.start();
    }).start();
    try {
      TimeUnit.SECONDS.sleep(5);
      seller.shutDown();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
