package com.junhua.design.pattern.template;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 11:37 AM
 */
public class BasketballGame implements Game {
  @Override
  public void init() {
    System.out.println("Basketball init");
  }

  @Override
  public void start() {
    System.out.println("basketball started");

  }

  @Override
  public void end() {
    System.out.println("basketball ended");
  }
}
