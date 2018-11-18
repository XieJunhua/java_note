package com.junhua.designmode.mediator;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:13 AM
 */
public abstract class AbstractColleague {
  protected AbstractMediator mediator;

  public AbstractColleague(AbstractMediator mediator) {
    this.mediator = mediator;
  }
}
