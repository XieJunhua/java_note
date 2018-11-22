package com.junhua.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 7:12 AM
 * Director 类是建造模式的关键。建造模式的核心是为了能适应在生产某个东西
 * 的时候，需要不断变化顺序而存在的模式
 */
public class Director {
  private ArrayList<String> actions = new ArrayList<>();
  private BenzBuilder benzBuilder = new BenzBuilder();
  private BMWBuilder bmwBuilder = new BMWBuilder();

  /**
   * 根据不同的构造顺序，排列组合，可以建造不同的产品，这就是构造模式的关键
   *
   * @return
   */
  public BenzModel createTypeABenzModel() {
    this.actions.clear();
    actions.add("start");
    actions.add("stop");
    benzBuilder.setSequence(actions);
    return (BenzModel) benzBuilder.getCarModel();
  }


  /**
   * another type Benz model
   * @return
   */
  public BenzModel createTypeBBenzModel() {
    this.actions.clear();
    actions.add("start");
    actions.add("alarm");
    actions.add("stop");
    benzBuilder.setSequence(actions);
    return (BenzModel) benzBuilder.getCarModel();
  }

  /**
   * build a BMW model
   * @return
   */
  public BMWModel createTypeABMWModel() {
    this.actions.clear();
    actions.add("start");
    actions.add("alarm");
    actions.add("stop");
    benzBuilder.setSequence(actions);
    return (BMWModel) benzBuilder.getCarModel();
  }

  /**
   * build another type of BMW model
   * @return
   */
  public BMWModel createTypeBBMWModel() {
    this.actions.clear();
    actions.add("start");
    actions.add("stop");
    benzBuilder.setSequence(actions);
    return (BMWModel) benzBuilder.getCarModel();
  }



}
