package com.victor.jvm;

/**
 * Created by xiejunhua on 2018/5/13.
 */
public class SlotTest {
  public static void main(String[] args) {
//    byte[] placeholder
    {
      byte[] placeholder = new byte[64 * 1024 * 1024];
      placeholder = null;
    }
    System.gc();
  }
}
