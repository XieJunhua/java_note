package com.junhua.designmode.mementro;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 8:58 AM
 * 备份对象
 */
public class Memento {
  private String state = "my status";

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
