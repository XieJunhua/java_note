package com.junhua.design.pattern.factory;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class MulOperation implements Operation {
  @Override
  public double calculate(double a, double b) {
    return a * b;
  }
}
