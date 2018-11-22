package com.junhua.design.pattern.singleton;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 7:24 AM
 * 在Singleton1的基础上改进,保证线程安全的同时，尽量保证了程序的销量。
 * 双重检测模式，只有在创建Singleton2这个类的时候才会出现锁的竞争；减少了在获取对象时的不必要竞争。
 */
public class Singleton2 {
  private Singleton2() {

  }

  /**
   * 注意这里要使用volatile关键字修饰，防止创建对象时，出现指令重复排序；参考url:
   * https://www.baeldung.com/java-singleton-double-checked-locking
   */
  private static volatile Singleton2 INSTANCE;

  public static Singleton2 getSingleton() {
    if (INSTANCE == null) {
      synchronized (Singleton2.class) {
        if (INSTANCE == null) {
          INSTANCE = new Singleton2();
        }
      }
    }
    return INSTANCE;
  }
}
