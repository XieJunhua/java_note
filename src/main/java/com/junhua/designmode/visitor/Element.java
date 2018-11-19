package com.junhua.designmode.visitor;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/20 6:44 AM
 */
public abstract class Element {
  public abstract void doSomething();

  public abstract void accept(Visitor visitor);

}
