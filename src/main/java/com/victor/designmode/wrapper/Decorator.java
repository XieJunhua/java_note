package com.victor.designmode.wrapper;

/**
 * Created by xiejunhua on 2017/5/14.
 * 抽象装饰角色，和具体构建有一致的接口实现(继承)
 */
public interface Decorator extends Beverage {
    String getDescription();
    double getPrice();
}
