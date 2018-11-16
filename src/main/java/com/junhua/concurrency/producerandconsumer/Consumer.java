package com.junhua.concurrency.producerandconsumer;

/**
 * Created by xiejunhua on 2018/5/11.
 * 在wait()/notify()机制中，不要使用全局对象，字符串常量等。应该使用对应唯一的对象。
 */
public class Consumer {
  private Shop shop;
//  private

  public Consumer(Shop shop) {
    this.shop = shop;
  }

  /**
   * 消费方法，注意这里的锁对象是shop， 而且wait对象也是shop。
   * 同时需要注意的是，notify()的对象要和wait的对象保存一致。
   * 这里我们可以根据shop.status判断count的值，来判断是否有信号发送。如果有信号发送出来，比如会导致count+1
   */
  public void consumer() {
    synchronized (shop) {
      if (shop.status() < 1) {
        try {
          shop.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      shop.consumer();
    }
  }

  /**
   * 为了防止假唤醒，保存信号的成员变量将在一个while循环里接受检查，而不是在if表达式里。
   * 自旋，直到被唤醒。
   */
  public void consumer2() {
    synchronized (shop) {
      while (shop.status() < 1) {
        try {
          shop.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      shop.consumer();
    }
  }
}
