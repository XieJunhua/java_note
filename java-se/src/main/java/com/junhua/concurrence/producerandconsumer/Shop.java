package com.junhua.concurrence.producerandconsumer;

/**
 * Created by xiejunhua on 2018/5/11.
 */
public class Shop {
  private int count;

  public Shop(int count) {
    this.count = count;
  }

  public void consumer() {
    count = count - 1;
    System.out.println(Thread.currentThread().getName() + " 当前余额：" + count);
  }

  public void producer() {
    count = count + 1;
    System.out.println(Thread.currentThread().getName() + "当前余额：" + count);
  }

  public int status() {
    return this.count;
  }
}
