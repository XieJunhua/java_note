package com.junhua.jvm.OOMtest;

import java.util.ArrayList;
import java.util.List;

/**
 * vm args: -Xms20M -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 堆最小值和最大值都设置为20M
 * Created by xiejunhua on 2018/5/13.
 */
public class HeapOOM {
  static class OOMObject {

  }
  public static void main(String[] args) {
    List<OOMObject> list = new ArrayList<>();
    while (true) {
      list.add(new OOMObject());
    }
  }
}
