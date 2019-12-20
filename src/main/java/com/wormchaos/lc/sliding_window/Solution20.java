package com.wormchaos.lc.sliding_window;

import java.util.Stack;

/**
 * Created by wormchaos on 2019-12-20.
 */
public class Solution20 {
    /**
     * 栈
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        char[] cArray = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (char c : cArray) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if(c == ')' || c == ']' || c == '}') {
                if(stack.size() == 0) {
                    return false;
                }
                char cInt = stack.pop();
                if(c == ')') {
                    if(cInt != '(') {
                        return false;
                    }
                }
                if(c == ']') {
                    if(cInt != '[') {
                        return false;
                    }
                }
                if(c == '}') {
                    if(cInt != '{') {
                        return false;
                    }
                }
            }

        }
        return stack.size() == 0;
    }

}
