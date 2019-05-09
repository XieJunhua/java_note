package com.junhua.concurrence.shareresource;

/**
 * Created by xiejunhua on 16/12/23.
 */
public abstract class IntGenerator {
//    private volatile boolean canceled = false; //volatile 在这里保证
    private boolean canceled = false; //volatile 保证可见性
    public  abstract int next();
    public void cancel(){
        canceled = true;
        Thread.yield();
    }
    public boolean isCanceled(){
        return canceled;
    }
}
