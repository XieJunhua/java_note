package com.junhua.designmode.wrapper;

/**
 * Created by xiejunhua on 2017/5/14.
 * 装饰类2
 */
public class Sugar implements Decorator {
    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n" + "sugar";
    }

    @Override
    public double getPrice() {
        return beverage.getPrice()  + 10;
    }
}
