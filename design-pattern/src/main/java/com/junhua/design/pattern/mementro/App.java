package com.junhua.design.pattern.mementro;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 9:03 AM
 */
public class App {
  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();

    // 创建备忘录，交给备忘录管理员
    caretaker.setMemento(originator.createMemento());

    // 回复备忘录
    originator.restoreMemento(caretaker.getMemento());
  }

}
