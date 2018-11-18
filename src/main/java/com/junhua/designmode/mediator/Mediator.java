package com.junhua.designmode.mediator;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:54 AM
 */
public class Mediator extends AbstractMediator {


  /**
   * 这里如果不需要封装一个AbstractMediator，完全可以定义各种方法，在其他类中之间调用
   * 而不需要用execute这种解析字符串的方式调用
   * @param str
   * @param objects
   */
  @Override
  public void execute(String str, Object... objects) {
    switch (str) {
      case "purchase.buy":
        this.buyComputer((Integer) objects[0]);
        break;
      case "sale.offSell":
        this.offSell();
        break;
      case "sale.sell":
        this.sellComputer((Integer) objects[0]);
        break;
      case "stock.clear":
        this.clearStock();
        break;
    }


  }

  private void buyComputer(int number) {
    int saleStatus = super.sale.getSaleStatus();
    if (saleStatus > 80) { // 销售良好，正常进货
      super.stock.increase(number);
    } else {// 销售一般，少量进货
      super.stock.increase(number / 2);
    }
  }

  private void sellComputer(int number) {
    if (super.stock.getStockNumber() < number) {
      super.purcharse.buyIBMcomputer(number);
    }
    super.stock.decrease(number);
  }

  private void offSell() {
    System.out.println("清空库存");
  }

  private void clearStock() {
    super.sale.offSale();
    super.purcharse.refuseBuyIBM();
  }



}
