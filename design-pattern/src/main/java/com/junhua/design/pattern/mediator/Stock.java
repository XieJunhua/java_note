package com.junhua.design.pattern.mediator;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:52 AM
 */
public class Stock extends AbstractColleague{
  private static int COMPUTER_NUMBER = 100;

  public Stock(AbstractMediator mediator) {
    super(mediator);
  }

  /**
   * 增加库存
   * @param number
   */
  public void increase(int number) {
    COMPUTER_NUMBER += number;
  }

  public void decrease(int number) {
    COMPUTER_NUMBER -= number;
  }

  public int getStockNumber() {
    return COMPUTER_NUMBER;
  }

  public void clearStock() {
    System.out.println("清空库存");
    super.mediator.execute("stock.clear");
  }


}
