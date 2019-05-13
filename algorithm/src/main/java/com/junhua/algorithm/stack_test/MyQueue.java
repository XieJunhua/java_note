package com.junhua.algorithm.stack_test;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.input = new Stack<>();
        this.output = new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        if (input.isEmpty() && !output.isEmpty()) {
            input = reverseStack(output);
        }
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (output.isEmpty()) {
            output = reverseStack(input);
        }
        return output.pop();
    }

    private static Stack reverseStack(Stack from) {
        Stack to = new Stack();
        if (!from.isEmpty()) {
            // 注意，遍历stack的时候有坑
            int len = from.size();
            for (int i = 0; i < len; i++) {
                to.push(from.pop());
            }
        }
        return to;

    }


    /** Get the front element. */
    public int peek() {
        if (output.isEmpty()) {
            output = reverseStack(input);
        }
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.pop());
    }
}
