package com.junhua.designmode.singleton;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 9:04 AM
 * 通过静态内部类的方式初始化Singleton3; 这种方式和在类中进行初始化类似。
 */
public class Singleton3 {
  private Singleton3() {

  }
  private static class Inner {
    private static final Singleton3 singleton3 = new Singleton3();
  }

  public Singleton3 getInstance() {
    return Inner.singleton3;
  }
}
