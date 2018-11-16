package com.junhua.designmode.single;

/**
 * Created by xiejunhua on 2017/8/20.
 */
public class App {


    public static void main(String[] args) {
        EnumTest enumTest = EnumTest.INSTANCE;
        // 单例模式的简单实现
        System.out.println(enumTest.equals(EnumTest.INSTANCE));

    }
}
