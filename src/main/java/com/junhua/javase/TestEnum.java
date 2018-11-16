package com.junhua.javase;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xiejunhua on 2018/5/22.
 */
public enum TestEnum {
  INSTANCE;

  TestEnum() {
    System.out.println("this is contractor");
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    HashMap map = new HashMap();

  }
}
