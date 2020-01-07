package com.wormchaos.lc.sliding_window.normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-6.
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()])  {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }


    public int[] dailyTemperaturesV1(int[] T) {
        int[] c = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (c[i] == 0 && T[j] > T[i]) {
                    c[i] = j - i;
                }
            }
        }
        return c;
    }
}
