package com.junhua.algorithm.mixed;

public class Search {

  public static void main(String[] args) {

//    System.out.println(sqrt(7));
    System.out.println(33 & 1);
  }

  public static int sqrt(int x) {
    if (x ==0 || x == 1) {
      return x;
    }
    int l = 0;
    int r = x;
    int res = 0;
    while (l <= r) {
      int m = l + (r - l)/2;
      if (m == x / m) {
        return m;
      } else if (m < x/m) {
        l = m + 1;
        res = m;
      } else {
        r = m -1;
      }
    }

    return res;
  }

}
