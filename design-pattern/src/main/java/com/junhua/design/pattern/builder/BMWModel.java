package com.junhua.design.pattern.builder;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 6:55 AM
 */
public class BMWModel extends AbstractCarModel {
  @Override
  public void start() {
    System.out.println("BMW start");
  }

  @Override
  public void stop() {
    System.out.println("BMW stop");

  }

  @Override
  public void alarm() {
    System.out.println("BMW alarm");

  }

  @Override
  public void engineBoom() {
    System.out.println("BMW engine boom");
  }
  
}
