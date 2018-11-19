package com.junhua.designmode.visitor;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/20 6:49 AM
 */
public class ConcreteVisitor extends Visitor {

  /**
   * 执行具体的Concrete中的方法，visit方法中的执行是访问者模式的关键
   * @param concreteElement2
   */
  @Override
  public void visit(Element concreteElement2) {
    concreteElement2.doSomething();
  }

//  @Override
//  public void visit(ConcreteElement1 concreteElement1) {
//    concreteElement1.doSomething();
//  }
//
//  @Override
//  public void visit(ConcreteElement2 concreteElement2) {
//    concreteElement2.doSomething();
//  }
}
