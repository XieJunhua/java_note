package com.victor.designmode.factorymethod;

import com.victor.designmode.simplefactory.AddOperation;
import com.victor.designmode.simplefactory.Operation;

/**
 * Created by xiejunhua on 2017/5/16.
 */
public class AddOperationFacroty implements OperationCreateFactory {
    @Override
    public Operation crateOperation() {
        return new AddOperation();
    }
}
