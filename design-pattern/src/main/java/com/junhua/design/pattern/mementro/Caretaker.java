package com.junhua.design.pattern.mementro;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 9:03 AM
 */
public class Caretaker {
  private Memento memento;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}
