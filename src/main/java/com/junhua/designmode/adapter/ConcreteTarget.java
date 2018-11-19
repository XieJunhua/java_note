package com.junhua.designmode.adapter;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 7:38 AM
 */
public class ConcreteTarget implements Target {

  @Override
  public void request() {
    System.out.println("do something in target");
  }
}
