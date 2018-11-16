package com.junhua.designmode.builder;

/**
 * Created by xiejunhua on 2017/5/20.
 * 抽象建造者类，确定产品由A，B两个部分组成
 */
public interface Builder {

    void buildPartA();
    void buildPartB();
    Product getResult();
}
