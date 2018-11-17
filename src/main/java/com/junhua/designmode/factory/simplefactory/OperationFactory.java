package com.junhua.designmode.factory.simplefactory;

import com.junhua.designmode.factory.*;

/**
 * Created by xiejunhua on 2017/5/14.
 */
public class OperationFactory {

    public static Operation getOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
        }
        return operation;
    }
}
