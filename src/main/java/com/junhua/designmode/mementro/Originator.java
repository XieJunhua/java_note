package com.junhua.designmode.mementro;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 8:57 AM
 * 需要备份的对象
 */
public class Originator {
  private String state = "status";

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memento createMemento() {
    return new Memento(this.state);
  }

  public void restoreMemento(Memento _memento) {
    this.setState(_memento.getState());
  }
}
