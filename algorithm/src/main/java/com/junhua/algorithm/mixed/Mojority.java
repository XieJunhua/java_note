package com.junhua.algorithm.mixed;

import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 */
public class Mojority {


  public static void main(String[] args) {

    majorityElement(new int[]{3,3,3,3,2,2,1,1,1});
  }


  public static int majorityElement(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      if (map.containsKey(n)) {
        map.put(n, map.get(n) + 1);
      } else {
        map.put(n, 1);
      }
    }
    TreeSet<Entry<Integer, Integer>> sets = new TreeSet<>(
        Comparator.comparingInt(Entry::getValue));
    sets.addAll(map.entrySet());
    System.out.println(sets.last().getKey());
    return 0;

  }
}

