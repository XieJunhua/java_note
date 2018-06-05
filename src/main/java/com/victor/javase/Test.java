package com.victor.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiejunhua on 2018/4/3.
 */
public class Test {
  public static void main(String[] args) {
    int i = 0;

    List<Integer> list = new ArrayList<>();
    list.add(++i);
    list.add(++i);
    list.add(++i);
    list.add(++i);
//    for (Integer cc: list) {
//      System.out.println(cc);
//    }
    list.forEach(cc -> System.out.println(cc.toString() + Thread.currentThread().getName()));
    list.forEach(cc -> System.out.println(cc.toString() + Thread.currentThread().getName()));
//    list.forEach(cc -> System.out.println(cc));
//    list.forEach(System.err :: println);
    list.forEach(System.err::println);
//    list.add(++i);
    Integer[] ints = new Integer[]{};
    ints = list.toArray(ints);
    System.out.println(Arrays.asList(ints));
  }

  public static void test1(List a) {
    System.out.println(a);
  }
}
