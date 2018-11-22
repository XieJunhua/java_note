package com.junhua.design.pattern.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:40 AM
 */
public class FemaleHumanFactory implements HumanFactory {
  @Override
  public Human createWhiteHuman() {
    return new WhiteFemaleHuman();
  }

  @Override
  public Human createYellowHuman() {
    return new YellowFemaleHuman();
  }
}
