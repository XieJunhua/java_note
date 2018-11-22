package com.junhua.design.pattern.factory.abstractfactory;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/17 10:29 AM
 */
public interface Human {
  void talk();
  void showSex();
  void showSkinColor();

  public default void sayHi() {
    talk();
    showSkinColor();
    showSex();
  }
}
