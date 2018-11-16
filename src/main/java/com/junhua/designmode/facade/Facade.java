package com.junhua.designmode.facade;

/**
 * Created by xiejunhua on 2017/5/18.
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
    }

    //可以根据子系统自由组合一些方法调用
    public void methondA() {
        subSystemTwo.methodTwo();
        subSystemOne.MethonOne();
    }
}
