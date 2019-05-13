package com.junhua.base;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {

//        printMap();
        printWeakMap();

    }

    private static void printMap() {
        HashMap<String, String> map = new HashMap<>();
        String a = new String("a");
        map.put(a, "aa");
        System.out.println(map);
        a = null;
        System.gc();
        System.out.println(map);
    }

    private static void printWeakMap() {
        Map<String, String> map = new WeakHashMap<>();
        String a = new String("a");
        map.put(a, "aa");
        System.out.println(map);
        a = null; //将key设为null之后，就会被主动回收
        System.gc();
        System.out.println(map);

    }
}
