package com.junhua.other;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Test1 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode next  = new ListNode(2);
//        ListNode next2 = new ListNode(3);
//        ListNode next3 = new ListNode(4);
//        ListNode next4 = new ListNode(5);
//        head.next = next;
//        next.next = next2;
//        next2.next = next3;
//        next3.next = next4;
//        System.out.println(FindKthToTail(head, 1).val);
//        HashMap map = new HashMap();
//        map.put("a", "a");
//        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//        concurrentHashMap.put("a", "a");
//        int i = 10;
//        System.out.println(i << 1);
//        System.out.println(4 & 5);
//        System.out.println("a".hashCode() & 10);
//        System.out.println("a".hashCode() & 19);
//        int h = "a".hashCode();
//        System.out.println((h) ^ (h >>> 16));
        System.out.println(92 & 15);
        System.out.println(96 & 16);
//        System.out.println(Integer.toBinaryString(15));
//        System.out.println(Integer.toBinaryString(94));
//        Field[] methods = ListNode.class.getDeclaredFields();
//        for (Field method: methods) {
//            System.out.println(method.getName());
//        }
//        ExecutorService executor = Executors.newCachedThreadPool();
//        executor.execute();
//        executor.
        Thread thread = new Thread();
        thread.start();
    }

    /**
     * 翻转链表
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode pre = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 找到倒数第几个节点
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail(ListNode head,int k) {
        // 如果链表为空或者k小于等于0
        if (head == null || k <= 0) {
            return null;
        }
        // 声明两个指向头结点的节点
        ListNode node1 = head;
        ListNode node2 = head;
        // 记录节点的个数
        int count = 0;
        // 记录k值，后面要使用
        int index = k;
        // p指针先跑，并且记录节点数，当node1节点跑了k-1个节点后，node2节点开始跑，
        // 当node1节点跑到最后时，node2节点所指的节点就是倒数第k个节点
        while (node1 != null) {
            node1 = node1.next;
            count++;
            if (k <= 1 && node1 != null) {
                node2 = node2.next;
            }
            k--;
        }
        // 如果节点个数小于所求的倒数第k个节点，则返回空
        if (count < index)
            return null;
        return node2;

    }
}
