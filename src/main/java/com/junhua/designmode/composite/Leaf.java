package com.junhua.designmode.composite;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 8:05 AM
 */
public class Leaf extends AbstractComponent {

  @Override
  public void doSomething() {
    System.out.println("do something in leaf node");
  }
}
