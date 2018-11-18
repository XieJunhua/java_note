package com.junhua.designmode.mediator;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:52 AM
 */
public class Purcharse extends AbstractColleague {


  public Purcharse(AbstractMediator mediator) {
    super(mediator);
  }

  public void buyIBMcomputer(int numer) {
    System.out.println("采购电脑" + numer + " 台");
    super.mediator.execute("purchase.buy", numer);
  }

  public void refuseBuyIBM() {
    System.out.println("don't need to buy IBM");
  }
}
