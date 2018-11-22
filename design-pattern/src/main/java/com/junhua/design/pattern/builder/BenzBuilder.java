package com.junhua.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:08 AM
 */
public class BenzBuilder extends AbstractCarBuilder {

  private BMWModel benzModel = new BMWModel();

  @Override
  public void setSequence(ArrayList<String> actions) {
    benzModel.setSequence(actions);
  }

  @Override
  public AbstractCarModel getCarModel() {
    return this.benzModel;
  }
}
