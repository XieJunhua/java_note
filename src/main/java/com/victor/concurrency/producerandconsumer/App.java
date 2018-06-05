package com.victor.concurrency.producerandconsumer;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 2018/5/11.
 * 生产消费模型， wait和notify的方式实现
 */
public class App {
  public static void main(String[] args) {
    Shop shop = new Shop(100);

    Consumer consumer = new Consumer(shop);

    for(int i = 0; i < 5; i++) {
      new Thread(() -> {
        while (true) {
          consumer.consumer2();
          try {
            TimeUnit.MILLISECONDS.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }).start();
    }



    new Thread(() -> {
      Producer producer = new Producer(shop);
      while (true) {
        producer.producer();
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }
}
