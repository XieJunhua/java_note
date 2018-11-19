package com.junhua.designmode.visitor;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/20 6:52 AM
 */
public class App {

  public static void main(String[] args) {
    for (int i = 0;i < 10;i++) {
      Element el = ObjectStruture.createElement();
      el.accept(new ConcreteVisitor());
    }
  }
}
