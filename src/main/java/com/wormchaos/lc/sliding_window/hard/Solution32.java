package com.wormchaos.lc.sliding_window.hard;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-3.
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
        // 0.. a最大长度
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    max = Math.max(i - stack.peek(), max);
                } else {
                    stack.push(i);
                }
            }
        }
        return max;
    }

    public int longestValidParenthesesV2(String s) {
        // 判断是否合法
        Integer max = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                int value = checkValid(c, i, j);
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private int checkValid(char[] c, int start, int end) {
        Stack<Character> stack = new Stack<>();
        for (int i = start; i <= end; i++) {
            if (c[i] == '(') {
                stack.push(c[i]);
            } else if (c[i] == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? end - start + 1 : 0;
    }
}
