package com.junhua.design.pattern.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:35 AM
 */
public class WhiteMaleHuman extends AbstractMaleHuman {
  @Override
  public void talk() {
    System.out.println("say English");
  }

  @Override
  public void showSkinColor() {
    System.out.println("show white color");
  }
}
