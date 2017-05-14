package com.victor.designmode.wrapper;

/**
 * Created by xiejunhua on 2017/5/14.
 * 装饰类1
 */
public class Milk implements Decorator {

    private Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n" + " milk";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + 20;
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
}
