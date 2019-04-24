package com.junhua.concurrence.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class LockTest {
    public static void main(String[] args) throws Exception {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient("localhost:2181", retryPolicy);
        client.start();

        InterProcessMutex mutex = new InterProcessMutex(client, "/curator/lock");
        // 获取锁
        mutex.acquire();
        // do some thing
        System.out.println("do some thing");
        // 释放锁
        mutex.release();
    }
}
