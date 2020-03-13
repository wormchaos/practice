package com.wormchaos.lc.sliding_window.normal;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-13.
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        Set<String> opSet = new HashSet<>();
        opSet.add("+");
        opSet.add("-");
        opSet.add("*");
        opSet.add("/");

        Stack<Integer> stack = new Stack();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (opSet.contains(token)) {
                // 运算
                int num1 = stack.pop();
                int num = stack.pop();
                if ("+".equals(token)) {
                    num += num1;
                } else if ("-".equals(token)) {
                    num -= num1;
                } else if ("*".equals(token)) {
                    num *= num1;
                } else if ("/".equals(token)) {
                    num /= num1;
                }
                stack.push(num);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        if (stack.isEmpty()) {
            return 0;
        } else {
            return stack.pop();
        }
    }
}
