package com.junhua.base;

public class DeadLockTest {
    public static void main(String[] args) {
        new Thread(() -> new ResourceHold("A", "B").exec()).start();

        new Thread(() -> new ResourceHold("B", "A").exec()).start();

    }
}

class ResourceHold {
    String lockA;
    String lockB;

    public ResourceHold(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    public void exec() {
        synchronized (lockA) {
            System.out.println("get lock : " + lockA + " : waiting for " + lockB);
            synchronized (lockB) {
                System.out.println("ddd");
            }
        }
    }

}
