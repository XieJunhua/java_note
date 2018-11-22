package com.junhua.design.pattern.strategy;

/**
 * Created by xiejunhua on 2017/5/14.
 * 商场销售某产品，不同时期有三种收费模式，1.正常收费。2.打折。3.满减
 * 策略模式: 定义了一系列算法，分别封装起来，让他们之间可以互相替换，算法的替换，不会影响到使用算法的客户端。
 * 在实践过程中，策略模式可以用来封装几乎任何类型的规则，只要在分析过程中听到需要在不同时间不同场景应用不同的业务规则，
 * 就可以考虑使用策略模式去处理这种变化的可能性。
 * 具体选择使用哪种算法，由客户端程序决定。
 */

public class App {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("打8折");
        System.out.println(cashContext.getResult(200));

    }
}
