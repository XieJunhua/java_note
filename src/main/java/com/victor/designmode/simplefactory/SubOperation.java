package com.victor.designmode.simplefactory;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class SubOperation implements Operation {
    public double calculate(double a, double b) {
        return a - b;
    }
}
