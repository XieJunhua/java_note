package com.junhua.concurrency;

import com.google.common.util.concurrent.SettableFuture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Created by xiejunhua on 2017/8/24.
 */
public class SettableFutureDemo {
    public static void main(String[] args) {
        SettableFuture<String> settableFuture = SettableFuture.create();
        settableFuture.set("SUCCESS");

        ExecutorService exec = Executors.newFixedThreadPool(2);
//        exec.execute();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();

        Map<String, String> map = new HashMap();
        map.put("a", "A");
        Iterator i = map.keySet().iterator();
        if (i.hasNext()) {
            String value = (String) i.next();
            map.put("dd", "a");

        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();





    }
}


