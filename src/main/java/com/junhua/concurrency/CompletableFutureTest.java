package com.junhua.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by xiejunhua on 2017/6/6.
 */
public class CompletableFutureTest {
    public static void main(String[] args) {

//        CompletableFutureTest completableFutureTest = new CompletableFutureTest();
//        Future<String> future = completableFutureTest.calcutateAsync();
//        try {
//            System.out.println(future.get());
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            return "Hello";
//        });
//
//        try {
//            CompletableFuture completableFuture = future.thenApply(s -> {
//                try {
//                    Thread.sleep(5000);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                return s + "world";
//            });
//            Long t1 = System.currentTimeMillis();
//
//            System.out.println(completableFuture.get());
//            Long t2 = System.currentTimeMillis();
//            System.out.println(t2 - t1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
//                .thenCombine(CompletableFuture.supplyAsync(() -> "world"), (s1, s2) -> s1 + s2);
//
//        try {
//            System.out.println(completableFuture.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "beautiful";
        });
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "word";
        });


//        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(future1, future2, future3);

        Long l1 = System.currentTimeMillis();
        String combined = Stream.of(future1, future2, future3).map(CompletableFuture::join).collect(Collectors.joining(" "));
//        try {
//            completableFuture.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }



        System.out.println(combined);
        Long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);

    }

    public Future<String> calcutateAsync() {
        final CompletableFuture<String> completableFuture = new CompletableFuture<>();


        Executors.newCachedThreadPool().submit(() -> {
           Thread.sleep(5000);
           completableFuture.complete("Hello");
           return null;
        });
        return  completableFuture;
    }
}
