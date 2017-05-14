package com.victor.designmode.wrapper;

import com.victor.designmode.wrapper.v2.BigTrouser;
import com.victor.designmode.wrapper.v2.Person;
import com.victor.designmode.wrapper.v2.TShirt;

/**
 * Created by xiejunhua on 2017/5/14.
 * 装饰模式: 装饰模式是为已有的功能动态的添加功能的一种方式。
 * 装饰模式的有点。把类中的装饰功能移除到具体的装饰类中，这样可以简化原有的类。
 */
public class App {

    public static void main(String[] args) {
//        Beverage beverage = new CoffeeBean1();
//        beverage = new Milk(beverage);
//        System.out.println(beverage.getPrice());
//        System.out.println(beverage.getDescription());
        Person p = new Person("xiaoming");
        BigTrouser bt = new BigTrouser();
        TShirt t = new TShirt();
        bt.decorate(p);
        bt.show();
//        t.decorate(bt);
//        t.show();

    }
}
