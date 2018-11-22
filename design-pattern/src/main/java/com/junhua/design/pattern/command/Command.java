package com.junhua.design.pattern.command;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:07 PM
 */
public abstract class Command {

  protected Stock stock;
  public Command(Stock stock) {
    this.stock = stock;
  }

  abstract void execute();
}
