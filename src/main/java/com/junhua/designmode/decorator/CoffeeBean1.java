package com.junhua.designmode.decorator;

/**
 * Created by xiejunhua on 2017/5/14.
 * 被装饰的具体类1
 */
public class CoffeeBean1 implements Beverage {
    @Override
    public String getDescription() {
        return "this is first coffee bean";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
