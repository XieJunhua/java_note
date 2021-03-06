package com.junhua.design.pattern.strategy;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class CashFactory {

    public static CashSuper crateCashSuper(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
        }
        return cs;
    }
}
