package com.junhua.design.pattern.adapter;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/19 7:41 AM
 * Adapter类，这里继承了Adaptee类，并实现了Target类
 */
public class Adapter extends Adaptee implements Target {

  @Override
  public void request() {
    super.doSomething();
  }
}
