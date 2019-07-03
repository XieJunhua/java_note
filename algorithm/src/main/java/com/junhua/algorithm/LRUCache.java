package com.junhua.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {


  private Deque<Integer> deque;
  private HashMap<Integer,Integer> map;
  private int capacity;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    deque = new ArrayDeque<>(capacity);
    map = new HashMap<Integer,Integer>(capacity);
  }

  public int get(int key) {
    if (!map.containsKey(key)) {
      return -1;
    }
    deque.remove(key);
    deque.offerFirst(key);
    return map.get(key);
  }

  public void put(int key, int value) {
    if (map.containsKey(key)) {
      deque.remove(key);
      deque.addFirst(key);
      if (map.get(key) != value) {
        map.put(key, value);
      }
    } else {
      if (deque.size() >= capacity) {
        map.remove(deque.getLast());
        deque.removeLast();
        deque.offerFirst(key);
        map.put(key, value);
      } else {
        deque.offerFirst(key);
        map.put(key, value);
      }
    }
  }

  public static void main(String[] args) {
    LRUCache lruCache = new LRUCache(2);
    lruCache.put(1,1);
    lruCache.put(2,2);
    System.out.println(lruCache.get(1));
    lruCache.put(3,3);
    System.out.println(lruCache.get(2));
  }

}
