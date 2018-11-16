package com.junhua.designmode.builder;

/**
 * Created by xiejunhua on 2017/5/20.
 * 指挥者类，指挥builder的生产过程
 */
public class Director {

    public void Construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
