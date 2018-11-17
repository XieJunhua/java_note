package com.junhua.designmode.singleton;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 8:07 AM
 * 最简单的创建一个线程安全的单例。因为静态属性只会被加载一次，所以 new Singleton()只会被执行一次。所以永远不会出现线程安全的问题
 */
public class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {

  }

  private Singleton getSingleton() {
    return singleton;
  }
}
