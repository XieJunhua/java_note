package com.junhua.designmode.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:30 AM
 */
public abstract class AbstractFemaleHuman implements Human{
  @Override
  public void showSex() {
    System.out.println("female");
  }

}
