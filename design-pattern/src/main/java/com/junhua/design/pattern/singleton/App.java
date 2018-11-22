package com.junhua.design.pattern.singleton;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 7:22 AM
 *
 */

public class App {
  public static void main(String[] args) {
    Singleton1 singleton1 = Singleton1.getSingleton();
    System.out.println(singleton1.toString());
    Singleton1 singleton11 = Singleton1.getSingleton();
    System.out.println(singleton11.toString());


  }
}
