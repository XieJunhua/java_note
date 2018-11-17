package com.junhua.designmode.factory;

import com.junhua.designmode.factory.Operation;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class AddOperation implements Operation {

  @Override
  public double calculate(double a, double b) {
    return a + b;
  }
}
