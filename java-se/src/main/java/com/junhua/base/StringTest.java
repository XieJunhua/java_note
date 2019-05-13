package com.junhua.base;

import java.util.HashMap;
import java.util.HashSet;

public class StringTest {
    public static void main(String[] args) {
        String a1 = "aaa";
        // 会生成两个对象(两个内存区域)，一个在heap中，一个在字符串常量池中(如果字符串常量池中存在相同的，则不创建)
        // a2这个引用指向heap中的内存区域(内存中的对象)
        String a2 = new String("aaa");

        String a3 = "aa" + "a";
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a2));

        // intern会将b这个引用到指针指向字符串常量池中的字符串对象(常量池中的地址)
        String b = new String("a").intern();
        String a = "a";
        System.out.println(a == b);

        String s = "who";
        System.out.println(s == "who");
        System.out.println("who" == "who");
        System.out.println("who" == new String("who"));
        System.out.println("who" == new String("who").intern());

    }
}
