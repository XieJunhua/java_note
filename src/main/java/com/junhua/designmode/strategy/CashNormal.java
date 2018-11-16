package com.junhua.designmode.strategy;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
