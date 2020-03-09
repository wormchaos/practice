package com.wormchaos.lc.sliding_window.normal;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-17.
 */
public class Solution31 {
    int min = Integer.MAX_VALUE;

    public void nextPermutation(int[] nums) {
        if(nums.length <= 1) {
            return;
        }
        boolean[] marked = new boolean[nums.length];
        int compNum = 0;
        for (int i = 0; i < nums.length; i++) {
            compNum = compNum * 10 + nums[i];
        }
        loop(nums, marked, new Stack<Integer>(), compNum);
        for (int i =nums.length - 1; i >=0; i--) {
            nums[i] = min %10;
            min /=10;
        }
    }

    private void loop(int[] nums, boolean[] marked, Stack<Integer> stack, int compNum) {
        if (stack.size() == nums.length) {
            int num = 0;
            Object[] r = stack.toArray();
            for (int i =0; i < r.length; i++) {
                num = num * 10 + (int)r[i];
            }
            if (num > compNum && num < min) {
                min = num;
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(!marked[i]) {
                    marked[i] = true;
                    stack.push(nums[i]);
                    loop(nums, marked, stack, compNum);
                    stack.pop();
                    marked[i] = false;
                }
            }
        }

    }
}
