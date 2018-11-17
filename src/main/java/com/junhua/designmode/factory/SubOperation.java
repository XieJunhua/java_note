package com.junhua.designmode.factory;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class SubOperation implements Operation {
  @Override
  public double calculate(double a, double b) {
    return a - b;
  }
}
