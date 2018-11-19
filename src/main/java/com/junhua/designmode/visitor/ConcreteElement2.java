package com.junhua.designmode.visitor;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/20 6:46 AM
 */
public class ConcreteElement2 extends Element {

  @Override
  public void doSomething() {
    System.out.println("do something at concrete element12");
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);

  }
}
