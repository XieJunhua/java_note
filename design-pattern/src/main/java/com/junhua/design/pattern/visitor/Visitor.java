package com.junhua.design.pattern.visitor;


/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/20 6:45 AM
 */
public abstract class Visitor {

  /**
   * 一般有多个Concrete Element 就有多个方法，
   * 可以在visitor实现类中对不同的Element做不同的处理
   */

//  public abstract void visit(ConcreteElement1 concreteElement1);

//  public abstract void visit(ConcreteElement2 concreteElement2);


  /**
   * 如果Element中的处理逻辑可以做封装，保持一致可以只使用一个
   * @param concreteElement2
   */
  public abstract void visit(Element concreteElement2);


}
