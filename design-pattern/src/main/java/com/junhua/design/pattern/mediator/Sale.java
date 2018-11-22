package com.junhua.design.pattern.mediator;

import java.util.Random;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:52 AM
 */
public class Sale extends AbstractColleague{

  public Sale(AbstractMediator mediator) {
    super(mediator);
  }

  /**
   * 获取销售状况
   * @return
   */
  public int getSaleStatus() {
    Random random = new Random();
    return random.nextInt(100);
  }

  public void sellIBMcomputer(int number) {
    System.out.println("卖出电脑" + number + "台");
    super.mediator.execute("sale.sell", number);
  }

  /**
   * 打折处理
   */
  public void offSale() {
    super.mediator.execute("sale.offSell");

  }
}
