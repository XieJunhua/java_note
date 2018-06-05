package com.victor.test.test1;

import java.util.ArrayList;

/**
 * Created by xiejunhua on 2018/4/30.
 */
public class A {
  private ArrayList arrayList = new ArrayList();

  public ArrayList test(ArrayList arrayList1) {
    arrayList.add(arrayList1.get(0));
    return arrayList;
  }

}
