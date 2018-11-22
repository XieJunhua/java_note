package com.junhua.design.pattern.factory.factorymethod;

import com.junhua.designmode.factory.AddOperation;
import com.junhua.designmode.factory.Operation;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 9:31 AM
 */
public class AddOperationFactory extends AbstractOperationFactory {
  @Override
  public Operation crateOperation() {
    return new AddOperation();
  }
}
