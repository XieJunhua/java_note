package com.victor.designmode.strategy;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class CashRebate implements CashSuper {

    private double rate;
    @Override
    public double acceptCash(double money) {
        return money * rate;
    }

    public CashRebate(double rate) {
        this.rate = rate;
    }
}
