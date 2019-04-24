package com.junhua.concurrence.AQS;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            final int finalI = i + 1;
            new Thread(() -> {
                System.out.println("thread " + finalI + " start");
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(1000) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread " + finalI + " finish");
                countDownLatch.countDown();
            }).start();
        }
        try {
            System.out.println("dd");
            countDownLatch.await();
            System.out.println("ff");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadNum + " thread finish");

    }
}
