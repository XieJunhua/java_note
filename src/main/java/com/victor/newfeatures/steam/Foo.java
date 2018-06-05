package com.victor.newfeatures.steam;

/**
 * Created by xiejunhua on 2017/8/10.
 */
public class Foo {

    private int a;

    public void add() {
        this.a++;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;

    }
}
