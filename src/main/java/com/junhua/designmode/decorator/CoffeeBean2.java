package com.junhua.designmode.decorator;

/**
 * Created by xiejunhua on 2017/5/14.
 * 被装饰的具体类2
 */
public class CoffeeBean2 implements Beverage {
    @Override
    public String getDescription() {
        return "this is second coffee bean";
    }

    @Override
    public double getPrice() {
        return 18;
    }
}
