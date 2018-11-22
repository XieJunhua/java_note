package com.junhua.design.pattern.visitor;

import java.util.Random;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/20 6:50 AM
 */
public class ObjectStruture {
  public static Element createElement() {
    Random random = new Random();
    if (random.nextInt(100) > 50) {
      return new ConcreteElement1();
    } else {
      return new ConcreteElement2();
    }
  }

}
