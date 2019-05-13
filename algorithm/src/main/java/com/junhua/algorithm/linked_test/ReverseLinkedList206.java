package com.junhua.algorithm.linked_test;

import com.junhua.algorithm.model.ListNode;


/**
 * 反转链表 leetcode 206 https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList206 {
    public static ListNode reverseList(ListNode head) {

        ListNode newHead = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        ListNode next1 = new ListNode(3);
        ListNode next2 = new ListNode(4);

        head.next = next;
        next.next = next1;
        next1.next = next2;
        System.out.println(head.hashCode());
        System.out.println(head);
        changeNext1(head);
        System.out.println(head);
        System.out.println(head.hashCode());
//        printNode(head);
//        System.out.println(head.hashCode());
//
//        System.out.println(head);
//        ListNode newHead = reverseList(head);
//
//        printNode(newHead);


    }

    public static void changeNext(ListNode listNode) {
        listNode.next = null;
    }

    // java传引用只是复制一个指向同一个地址的引用
    public static void changeNext1(ListNode listNode) {
        listNode = new ListNode(1);
    }

    public static void printNode(ListNode printNode) {
        while (printNode != null) {
            System.out.println(printNode);
            printNode = printNode.next;
        }
    }
}
