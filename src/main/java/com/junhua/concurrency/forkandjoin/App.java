package com.junhua.concurrency.forkandjoin;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by xiejunhua on 2017/9/6.
 */
public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        int[] arr = new int[1000];
//        ForkJoinPool service = new ForkJoinPool();
//        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
////        concurrentHashMap.put()
//
//        int total = 0;
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int temp = random.nextInt(100);
//            arr[i] = temp;
//            total += temp;
//        }
//        System.out.println(total);
//        Future<Integer> future = service.submit(new MyForkAndJoinTask(arr, 0, arr.length));
//
//        System.out.println(future.get());
//        HashMap hashMap = new

//        service.shutdown();

        String a = "abc";
        System.out.println(a.toLowerCase() == a );
        List list = new ArrayList();

        test(list);
    }

    public static void test(List list) {

    }
}
