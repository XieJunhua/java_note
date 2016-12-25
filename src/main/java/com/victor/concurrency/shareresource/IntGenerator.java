package com.victor.concurrency.shareresource;

/**
 * Created by xiejunhua on 16/12/23.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public  abstract int next();
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
