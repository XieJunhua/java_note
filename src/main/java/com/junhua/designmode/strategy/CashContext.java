package com.junhua.designmode.strategy;

/**
 * Created by xiejunhua on 2017/5/14.
 * 封装了三种不同的收费方法，这里简化了代码，将CashFactory的功能移到了这里。
 */
public class CashContext {

    //具体的算法实现是在cashSuper的子类中实现的。CashContext只是拿到一个cashSuper的引用而已。
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
