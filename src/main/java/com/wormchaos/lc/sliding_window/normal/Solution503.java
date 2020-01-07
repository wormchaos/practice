package com.wormchaos.lc.sliding_window.normal;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-6.
 */
public class Solution503 {

    /**
     * 从后往前
     * @param nums
     * @return
     */
    public int[] nextGreaterElements(int[] nums) {
        int[] c = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            // while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
            while (!stack.isEmpty() && nums[i % nums.length] >= stack.peek()) {
                stack.pop();
            }
            c[i % nums.length] = stack.isEmpty() ? -1 : stack.peek();
            // stack.push(i % nums.length);
            stack.push(nums[i % nums.length]);
        }
        return c;
    }

}
