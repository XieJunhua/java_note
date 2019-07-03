package com.junhua.algorithm;

public class QuickUnionUF {

  private int[] roots;

  public QuickUnionUF(int n) {
    roots = new int[n];
    for (int i = 0; i < roots.length; i++) {
      roots[i] = i;
    }
  }

  private int findRoot(int i) {
    int root = i;
    while (root != roots[i]) {
      root = roots[root];

    }
    return root;
  }

  public static void main(String[] args) {

  }

}
