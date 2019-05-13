package com.junhua.base;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeCache {
    private int result;

    public int getResult() {
        return result;
    }

    public synchronized void setResult(int result) {
        this.result = result;
    }

    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.clear();
    }
}
