package com.junhua.concurrence.producerandconsumer;

/**
 * Created by xiejunhua on 2018/5/11.
 */
public class Producer {
  private Shop shop;

  public Producer(Shop shop) {
    this.shop = shop;
  }

  public void producer() {
    synchronized (shop) {
      shop.producer();
      shop.notify();
    }
  }
}
