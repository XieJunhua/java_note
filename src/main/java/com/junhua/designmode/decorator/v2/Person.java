package com.junhua.designmode.decorator.v2;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public Person() {

    }
    public void show() {
        System.out.println(name);
    }
}
