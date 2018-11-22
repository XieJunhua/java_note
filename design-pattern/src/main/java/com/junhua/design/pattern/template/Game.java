package com.junhua.design.pattern.template;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 11:31 AM
 */
public interface Game {
  void init();

  void start();

  void end();


  /**
   * 模板
   * 定义了一个所有子类都要遵循的流程。
   * 可以将一些子类中通用的代码提取到模板方法中
   */
  default void enroll() {
    init();

    start();

    end();

  }
}
