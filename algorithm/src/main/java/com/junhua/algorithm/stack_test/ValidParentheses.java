package com.junhua.algorithm.stack_test;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

/**
 *
 */
public class ValidParentheses {


    private static boolean valid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (char c: chars) {


            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }
                switch (c) {
                    case ')':
                        if (characters.peek() == '(') {
                            characters.pop();
                        } else {
                            return false;
                        }
                        break;

                    case '}':
                        if (characters.peek() == '{') {
                            characters.pop();
                        } else {
                            return false;
                        }
                        break;

                    case ']':
                        if (characters.peek() == '[') {
                            characters.pop();
                        } else {
                            return false;
                        }
                        break;
                }
            }
        }
        return characters.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(valid("[[]]}"));
    }
}
