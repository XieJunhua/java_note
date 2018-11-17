package com.junhua.designmode.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:40 AM
 */
public class MaleHumanFactory implements HumanFactory {
  @Override
  public Human createWhiteHuman() {
    return new WhiteMaleHuman();
  }

  @Override
  public Human createYellowHuman() {
    return new YellowMaleHuman();
  }
}
