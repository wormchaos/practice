package com.wormchaos.lc.sliding_window.normal;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-20.
 */
public class Solution901 {

    class StockSpanner {

        Stack<Integer> stack;
        Stack<Integer> lenStack;

        public StockSpanner() {
            stack = new Stack<>();
            lenStack = new Stack<>();
        }

        public int next(int price) {
            int len = 1;
            while (!stack.isEmpty() && price >= stack.peek()) {
                stack.pop();
                len += lenStack.pop();
            }
            stack.push(price);
            lenStack.push(len);
            return len;
        }
    }
}
