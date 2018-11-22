package com.junhua.design.pattern.factory.factorymethod;

import com.junhua.designmode.factory.Operation;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 9:40 AM
 */
public abstract class AbstractOperationFactory implements OperationCreateFactory {


  /**
   * 通用的工厂方法类，具体生产什么，根据传入的类型决定
   * @param c 传入参数类型
   * @param <T> 传入参数类
   * @return
   */
  @Override
  public <T extends Operation> T createOperation(Class<T> c) {
    T o = null;
    try {
      o = (T) Class.forName(c.getName()).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    return o;
  }
}
