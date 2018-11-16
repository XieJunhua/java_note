package com.junhua.designmode.factorymethod;

import com.junhua.designmode.simplefactory.AddOperation;
import com.junhua.designmode.simplefactory.Operation;

/**
 * Created by xiejunhua on 2017/5/16.
 */
public class AddOperationFacroty implements OperationCreateFactory {
    @Override
    public Operation crateOperation() {
        return new AddOperation();
    }
}
