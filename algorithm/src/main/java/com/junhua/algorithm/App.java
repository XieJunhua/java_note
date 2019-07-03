package com.junhua.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

/**
 * @author junhua xjhclks@163.com
 * @date 2019/6/15 4:37 PM
 */
public class App {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
//    list.add("a");
//    list.add("b");
//    Iterator<String> s = list.iterator();
//    while (s.hasNext()) {
//      String s1 = s.next();
//      if (s1.equals("a")) {
//        s.remove();
//      }
//    }
//    LinkedList linkedList = new LinkedList();
//    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
//    LinkedHashMap map1 = new LinkedHashMap();
//    ConcurrentSkipListMap map2 = new ConcurrentSkipListMap();
//    ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();
//    stringThreadLocal.set("a");
//    Thread t = new Thread();
//    t.getState();
    Stream.of("a,b,c".split(",")).map(x -> CompletableFuture.supplyAsync(() -> x))
    .forEach(a -> {
      a.thenApplyAsync(b -> {
        if ("b".equals(b)) {
          a.thenAcceptAsync(x -> {System.out.println(x + "1");});
        }
//        System.out.println(b);
        return b;
      }).thenAcceptAsync(System.out::println);
    });
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

//    TreeMap map2 = new TreeMap();
//    map2.put("a", "b");
//    map1.put("a", "b");
//    map.put("aa", "b");
//    String key = "中国人";
//    int h = key.hashCode();
//    System.out.println(Integer.toBinaryString(h));
//    System.out.println(Integer.toBinaryString(h >>> 16));
//    System.out.println(h);
//    int hash = h ^ (h >>> 16);
//    System.out.println(hash);
//    System.out.println(Integer.toBinaryString(hash));
//    System.out.println(list);
  }

}
