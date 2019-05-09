package com.junhua.concurrence.readwritelock;

import java.util.Random;

/**
 * Created by xiejunhua on 2018/4/26.
 */
public class App {
  public static void main(String[] args) {
    final ReadWrite readWrite = new ReadWrite();

    for (int i = 0; i < 3; i++) {


      new Thread(new Runnable() {
        @Override
        public void run() {
          readWrite.put(new Random().nextInt(8));
        }
      }).start();
    }
    System.out.println("test");
    for (int i = 0; i < 5; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          readWrite.get();
        }
      }).start();
    }
  }
}
