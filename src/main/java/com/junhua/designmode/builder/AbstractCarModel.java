package com.junhua.designmode.builder;

import java.util.ArrayList;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/18 6:53 AM
 */
public abstract class AbstractCarModel {
  private ArrayList<String> actions = new ArrayList<>();

  /**
   * the car start
   */
  abstract void start();

  /**
   * the car stop
   */
  abstract void stop();

  /**
   * the car alarm
   */
  abstract void alarm();

  /**
   * the car engine voice
   */
  abstract void engineBoom();


  /**
   * 这里用了一个模板方法来进行具体的执行
   */
  public void run() {
    for (String action : actions) {
      switch (action) {
        case "start":
          this.start();
          break;
        case "stop":
          this.stop();
          break;
        case "alarm":
          this.alarm();
          break;
        case "engineBoom":
          this.engineBoom();
          break;
      }
    }

  }

  /**
   * 设置具体的构造规格
   * @param actions
   */
  void setSequence(ArrayList<String> actions) {
    this.actions = actions;
  }
}
