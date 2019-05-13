package com.junhua.algorithm.model;

public class ListNode {
    int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
