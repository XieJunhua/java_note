package com.junhua.concurrence.forkandjoin;

import java.util.concurrent.RecursiveTask;

/**
 * Created by xiejunhua on 2017/9/6.
 */
public class MyForkAndJoinTask extends RecursiveTask<Integer>{

    private static final int MAX = 70;
    private int[] arr;
    private int start;
    private int end;


    public MyForkAndJoinTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if ((end - start) < MAX) {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            System.out.println("任务分解======");
            int middle = (start + end) / 2;
            MyForkAndJoinTask left = new MyForkAndJoinTask(arr, start, middle);
            MyForkAndJoinTask right = new MyForkAndJoinTask(arr, middle, end);
            left.fork();
            right.fork();
            return left.join() + right.join();

        }
    }
}
