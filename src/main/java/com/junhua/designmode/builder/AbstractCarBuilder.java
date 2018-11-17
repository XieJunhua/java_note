package com.junhua.designmode.builder;

import java.util.ArrayList;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:06 AM
 * role abstract Builder
 */
public abstract class AbstractCarBuilder {

  /**
   * 设置构造指令，需要按照什么规格构造，顺序和排列
   * @param actions
   */
  public abstract void setSequence(ArrayList<String> actions);

  public abstract AbstractCarModel getCarModel();
}
