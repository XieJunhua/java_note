package com.junhua.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiejunhua on 2018/5/13.
 */
public class StaticResolution {

  public final List list = new ArrayList();

  public static void sayHello() {
    System.out.println("hello");
  }

  public static void main(String[] args) {
    StaticResolution.sayHello();
  }
}
