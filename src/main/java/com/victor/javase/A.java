package com.victor.javase;

/**
 * Created by xiejunhua on 2018/3/29.
 */
public class A {

  private String a;

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  @Override
  public boolean equals(Object o) {
//    super.equals()
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    A a1 = (A) o;

    return a != null ? a.equals(a1.a) : a1.a == null;
  }

  @Override
  public int hashCode() {
    return a != null ? a.hashCode() : 0;
  }

  public static void main(String[] args) {
    A a = new A();
    a.setA("a");
    A a1 = new A();
    a1.setA("a");
    System.out.println(a.hashCode());
    System.out.println(a1.hashCode());
    System.out.println(a == a1);
    String t = "a1";
    switch (B.valueOf(t)){
      case b1:
        System.out.println();

    }

    System.out.println();
//    switch (t):
  }
}
