package com.junhua.design.pattern.facade;

/**
 * Created by xiejunhua on 2017/5/18.
 * 外观模式: 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
public class App {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.methondA();

    }
}
