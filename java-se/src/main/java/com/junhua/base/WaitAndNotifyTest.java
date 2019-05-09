package com.junhua.base;

public class WaitAndNotifyTest {
    public static void main(String[] args) {

        PrintDemo printDemo = new PrintDemo();

        new Thread(printDemo::printSingle).start();
        new Thread(printDemo::printDouble).start();

    }
}

class PrintDemo {
    public void printSingle() {
        synchronized (this) {

            for (int i = 1; i < 100; i++) {
                notify();
                if (i % 2 == 1) {
                    System.out.println(i);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void printDouble() {
        synchronized (this) {

            for (int i = 1; i < 100; i++) {
                notify();
                if (i % 2 == 0) {
                    System.out.println(i);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

