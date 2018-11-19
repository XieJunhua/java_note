package com.junhua.designmode.composite;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 8:06 AM
 * 组合模式是一个树形的结构，在一个对象中包含其他对象，这些对象有可能是终点对象
 * 也有可能是非终点对象(还能继续包含对象)
 */
public class App {


  public static void main(String[] args) {
    Composite root = new Composite();
    root.doSomething();

    Composite branches = new Composite();

    AbstractComponent leaf = new Leaf();
    AbstractComponent leaf1 = new Leaf();

    root.add(branches);
    branches.add(leaf);
    branches.add(leaf1);
    display(root);

  }

  public static void display(Composite root) {
    for (AbstractComponent c: root.getComponentArrayList()) {
      if (c instanceof Leaf) {
        c.doSomething();
      } else {
        display((Composite) c);
      }
    }
  }

}
