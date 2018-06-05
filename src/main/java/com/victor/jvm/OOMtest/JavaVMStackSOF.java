package com.victor.jvm.OOMtest;

/**
 * Created by xiejunhua on 2018/5/13.
 */
public class JavaVMStackSOF {
  private int stackLength = 1;

  public void stackLeak() {
    stackLength++;
    stackLeak();
  }

  public static void main(String[] args) {
    JavaVMStackSOF oom = new JavaVMStackSOF();
    try {
      oom.stackLeak();
    } catch (Throwable e) { // 这里是发生了error并不能用Exception 去捕获
      System.out.println("stack length: " + oom.stackLength); // 通过xss减小栈的大小，栈的深度会减小
      throw e;
    }

  }

}
