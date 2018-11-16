package com.junhua.concurrency.shareresource;

import java.util.HashMap;
import java.util.Vector;

/**
 * Created by xiejunhua on 2018/5/29.
 */
public class Test {
  public static void main(String[] args) {
//    A a = new A(10);
//    for (int i = 0; i < 20; i++) {
//      new Thread(() -> {
//        a.addCount();
//      }).start();
//      new Thread(() -> {
////        while (true) {
//          System.out.println(a.getCount());
////        try {
////          TimeUnit.SECONDS.sleep(1);
////        } catch (InterruptedException e) {
////          e.printStackTrace();
////        }
////        }
//      }).start();
//    }
    HashMap<String, Integer> hashMap = new HashMap();
    hashMap.put("a", 1);
    System.out.println(hashMap.get("b"));



  }

}

class A {
  private int count;
  Vector vector = new Vector();

  public synchronized int getCount() {
    return count;

  }

  public void setCount(int count) {
    this.count = count;
  }

  public synchronized void  addCount() {
//    try {
//      TimeUnit.SECONDS.sleep(10);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    count = count + 1;
  }

  public A(int count) {
    this.count = count;
  }
}
