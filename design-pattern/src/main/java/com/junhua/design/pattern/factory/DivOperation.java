package com.junhua.design.pattern.factory;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class DivOperation implements Operation {

  @Override
  public double calculate(double a, double b) {
    if (b == 0) {
      throw new RuntimeException("the second parameter couldn't be 0");
    }
    return a / b;
  }
}
