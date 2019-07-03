package com.junhua.algorithm;

import java.util.Arrays;
import java.util.List;

public class Solution120 {

  public static void main(String[] args) {
    List<List<Integer>> list = Arrays.asList(
        Arrays.asList(2),
        Arrays.asList(3,4),
        Arrays.asList(5,6,7),
        Arrays.asList(1,3,4,5));
    _dfs(list, 0, 0, "");


  }

  private static int _dfs(List<List<Integer>> list, int i, int j, String path) {
    if (i == list.size() -1) {
      path += list.get(i).get(j);
      System.out.println(path);
      return 0;
    }

    path += list.get(i).get(j) + "->";

    _dfs(list, i+1, j, path);
    _dfs(list, i + 1, j+1, path);
    return 0;
  }


}
