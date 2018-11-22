package com.junhua.design.pattern.command;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:14 PM
 */
public class App {
  public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Stock stock = new Stock("alibaba", 188);
    invoker.setCommand(new BuyCommand(stock));
    invoker.action();


  }
}
