package com.junhua.design.pattern.factory.factorymethod;

import com.junhua.design.pattern.factory.Operation;

/**
 * Created by xiejunhua on 2017/5/16.
 */
public interface OperationCreateFactory {

  /**
   * 创建操作类型
   * @return 操作类型
   */
  Operation crateOperation();

  <T extends Operation> T createOperation(Class<T> c);
}
