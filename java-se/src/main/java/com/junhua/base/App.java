package com.junhua.base;

import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class App {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        ExecutorService executorService = Executors.newCachedThreadPool()
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(() -> {

        });

        executorService.shutdown();

        AtomicInteger atomicInteger = new AtomicInteger();
        LongAdder longAdder = new LongAdder();
        longAdder.increment();
        longAdder.longValue();

        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("", "");

    }
}
