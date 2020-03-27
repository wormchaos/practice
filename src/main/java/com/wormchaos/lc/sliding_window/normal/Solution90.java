package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-27.
 */
public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 子集
        Arrays.sort(nums);
        Stack<Integer> stack = new Stack();
        boolean[] marked = new boolean[nums.length];
//        for (int len = 1; len < nums.length; len++) {
        dfs(nums, -1, stack, marked, result);
//        }
        return result;
    }

    private void dfs(int[] nums, int current, Stack<Integer> stack, boolean[] marked, List<List<Integer>> result) {
        if (nums.length < stack.size()) {
            return;
        }
        result.add(new ArrayList<>(stack));
        // 寻找这一层的值
        for (int i = current + 1; i< nums.length; i++) {
            if(!marked[i]) {
                stack.push(nums[i]);
                marked[i] = true;
                dfs(nums, i, stack, marked, result);
                stack.pop();
                marked[i] = false;
                while (i + 1< nums.length && nums[i] == nums[i+1]) {
                    i++;
                }
            }
        }

    }


}
