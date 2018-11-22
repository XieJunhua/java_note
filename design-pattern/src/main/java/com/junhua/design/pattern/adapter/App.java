package com.junhua.design.pattern.adapter;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 7:42 AM
 */
public class App {

  public static void main(String[] args) {
    Target target = new ConcreteTarget();
    target.request();
    Target target1 = new Adapter();
    target1.request();
  }

}
