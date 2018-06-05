package com.victor.javase;

/**
 * Created by xiejunhua on 2018/5/22.
 */
public class App {
  public static void main(String[] args) {
    TestEnum t = TestEnum.INSTANCE;
    TestEnum t2 = TestEnum.INSTANCE;
    System.out.println(t == t2);
  }
}
