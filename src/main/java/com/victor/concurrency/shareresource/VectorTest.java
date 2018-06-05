package com.victor.concurrency.shareresource;

import java.util.Vector;

/**
 * Created by xiejunhua on 2018/5/29.
 */
public class VectorTest {
  private static Vector<Integer> vector = new Vector<>();

  public static void main(String[] args) {
    for (int i =0;;) {
      for (int j = 0; j< 10; j++) {
        vector.add(i);
      }

      Thread t = new Thread(() -> {
        for (int j = 0; j < vector.size(); j++) {
          vector.remove(j);
        }
      });

      Thread t1 = new Thread(() -> {
        for (int j = 0; j < vector.size(); j++) {
          System.out.println(vector.get(j));
        }
      });

      t.start();
      t1.start();

      while (Thread.activeCount() > 20);
    }
  }
}
