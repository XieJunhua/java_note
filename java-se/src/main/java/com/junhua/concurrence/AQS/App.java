package com.junhua.concurrence.AQS;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.submit(new Thread(() -> {
//            System.out.println("dd");
//        }));
//        System.out.println(Math.abs("b4efcd71d52043f78291a0bf560887c0".hashCode()) % 10000);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-mm-dd HH:mm:ss");
//        String expiresDt = simpleDateFormat.format(new Date(1553778200000L));
//        System.out.println(expiresDt);
//        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        test(8);
//        LinkedList


    }

    public static void test(int i) {
        out:
        if (i < 10) {
            if (i == 9) {
                System.out.println(i);
               break out;
            }
            System.out.println("i" + 10);
        }
        System.out.println("ddd");
    }
}
