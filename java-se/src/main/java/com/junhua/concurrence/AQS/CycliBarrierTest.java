package com.junhua.concurrence.AQS;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CycliBarrierTest {
    public static void main(String[] args) {
        int n = 4;
        CyclicBarrier barrier = new CyclicBarrier(n);
        for (int i = 0;i < n; i++) {
            new Work(barrier).start();
        }

    }
    static class Work extends Thread {
        private CyclicBarrier cyclicBarrier;
        public Work(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("线程: " + Thread.currentThread().getName() + " 正在工作");
            try {
                Thread.sleep((long)(Math.random() * 10000));
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完成" + System.currentTimeMillis());
                System.out.println(cyclicBarrier.getParties());
                System.out.println(cyclicBarrier.getNumberWaiting());
                cyclicBarrier.await();// 等待其他线程完成，直到所有线程完成之后，才执行后面的代码
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("所有线程" + Thread.currentThread().getName() + "写入数据完成" + System.currentTimeMillis());
        }
    }
}
