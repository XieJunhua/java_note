package com.junhua.designmode.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:35 AM
 */
public class YellowFemaleHuman extends AbstractFemaleHuman {
  @Override
  public void talk() {
    System.out.println("say Chinese");
  }

  @Override
  public void showSkinColor() {
    System.out.println("show yellow color");
  }
}
