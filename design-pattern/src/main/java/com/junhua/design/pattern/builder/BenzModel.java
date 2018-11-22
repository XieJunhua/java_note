package com.junhua.design.pattern.builder;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 6:55 AM
 */
public class BenzModel extends AbstractCarModel {
  @Override
  public void start() {
    System.out.println("Benz start");
  }

  @Override
  public void stop() {
    System.out.println("Benz stop");

  }

  @Override
  public void alarm() {
    System.out.println("Benz alarm");

  }

  @Override
  public void engineBoom() {
    System.out.println("Benz engine boom");
  }

}
