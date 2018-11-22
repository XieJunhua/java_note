package com.junhua.design.pattern.strategy;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;
    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyReturn = moneyReturn;
        this.moneyCondition = moneyCondition;
    }


}
