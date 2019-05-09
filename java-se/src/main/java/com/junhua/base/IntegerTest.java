package com.junhua.base;


public class IntegerTest {
    public static void main(String[] args) {

        // Integer中对于字面量会使用到缓存，字面量实质是调用了Integer.valueOf();
        Integer a1 = 1;
        Integer a2 = 1;

        System.out.println("a1 equals a2: " + a1.equals(a2));
        System.out.println("a1 == a2: " + (a1 == a2));

        a1 = 128;
        a2 = 128;


        System.out.println("a1 equals a2: " + a1.equals(a2));
        System.out.println("a1 == a2: " + (a1 == a2));

        a1 = new Integer(1);
        a2 = new Integer(1);

        System.out.println("a1 equals a2: " + a1.equals(a2));
        System.out.println("a1 == a2: " + (a1 == a2));

        a1 = new Integer(128);
        a2 = new Integer(128);

        System.out.println("a1 equals a2: " + a1.equals(a2));
        System.out.println("a1 == a2: " + (a1 == a2));
        Integer.valueOf(1);

//        int a3 = 5;
//        Integer a3 = null;
//        int a4 = a3;
//        System.out.println(a4);

    }
}
