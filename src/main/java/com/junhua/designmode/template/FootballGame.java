package com.junhua.designmode.template;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 11:35 AM
 */
public class FootballGame implements Game {
  @Override
  public void init() {
    System.out.println("start init Football game...");
  }

  @Override
  public void start() {
    System.out.println("football game started");

  }

  @Override
  public void end() {
    System.out.println("football game ended");
  }
}
