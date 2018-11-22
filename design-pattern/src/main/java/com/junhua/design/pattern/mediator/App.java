package com.junhua.design.pattern.mediator;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 8:30 AM
 * 中介者模式的关键在于，对多个强关联的类解耦。解耦之后的这戏类只与中介者之间发生关系
 * 而互相不发生关系。而他们之间的关系处理逻辑完全在中介者中来完成
 */
public class App {
  public static void main(String[] args) {
    AbstractMediator mediator = new Mediator();
    Purcharse purcharse = new Purcharse(mediator);
    purcharse.buyIBMcomputer(100);

    Sale sale = new Sale(mediator);
    sale.sellIBMcomputer(10);

    Stock stock = new Stock(mediator);
    stock.clearStock();
  }
}
