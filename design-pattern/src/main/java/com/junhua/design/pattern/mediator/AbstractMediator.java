package com.junhua.design.pattern.mediator;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:51 AM
 */
public abstract class AbstractMediator {
  protected Purcharse purcharse;
  protected Sale sale;
  protected Stock stock;

  public AbstractMediator() {
    this.purcharse = new Purcharse(this);
    this.sale = new Sale(this);
    this.stock = new Stock(this);
  }

  /**
   * 中介者模式的核心方法，具体可以根据中介者的定位来具体定义参数类型
   * @param str
   * @param objects
   */
  public abstract void execute(String str, Object...objects);


}
