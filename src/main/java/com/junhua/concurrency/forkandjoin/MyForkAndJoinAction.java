package com.junhua.concurrency.forkandjoin;

import java.util.concurrent.RecursiveAction;

/**
 * Created by xiejunhua on 2017/9/6.
 */
public class MyForkAndJoinAction extends RecursiveAction {

    private static final int MAX = 20;

    private int start;
    private int end;

    public MyForkAndJoinAction(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < MAX) {
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName() + "的i值: " + i);
            }
        } else {
            int middle = (start + end) / 2;
            new MyForkAndJoinAction(start, middle).fork();
            new MyForkAndJoinAction(middle, end).fork();
        }

    }
}
