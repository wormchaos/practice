package com.wormchaos.lc.sliding_window.hard;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-20.
 */
public class Solution84 {

    public int largestRectangleArea(int[] heights) {
        int[] next = new int[heights.length];
        int[] pre = new int[heights.length];
        // 下一个小数所在坐标
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                next[stack.pop()] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            next[stack.pop()] = -1;
        }

        // 上一个小数所在坐标
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                pre[stack.pop()] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            pre[stack.pop()] = -1;
        }

        //每个点依次算
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int len = (pre[i] == -1 ? i : i-pre[i] - 1) + (next[i] == -1 ? heights.length - 1 - i : next[i] - i - 1);
            max = Math.max(heights[i] * (len + 1), max);
        }
        return max;

    }
}
