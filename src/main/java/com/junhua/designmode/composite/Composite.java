package com.junhua.designmode.composite;

import java.util.ArrayList;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 8:00 AM
 */
public class Composite extends AbstractComponent {

  private ArrayList<AbstractComponent> componentArrayList = new ArrayList<>();

  public void add(AbstractComponent abstractComponent) {
    this.componentArrayList.add(abstractComponent);
  }

  public void remove(AbstractComponent abstractComponent) {
    this.componentArrayList.remove(abstractComponent);
  }

  public ArrayList<AbstractComponent> getComponentArrayList() {
    return componentArrayList;
  }
}
