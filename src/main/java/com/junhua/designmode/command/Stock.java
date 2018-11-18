package com.junhua.designmode.command;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:07 PM
 * 接收对象，这里以股票买卖为例
 */
public class Stock {
  private String name;
  private int price;


  public Stock(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public Stock() {
  }

  public void buy() {
    System.out.println("buy some Stock and the name " + this.name
            + " price " + this.price);
  }

  public void sell() {
    System.out.println("sell some Stock and the name " + this.name
            + " price " + this.price);
  }

}
