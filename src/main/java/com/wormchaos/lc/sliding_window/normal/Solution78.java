package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-2.
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        // 排序
        Arrays.sort(nums);
        return subsetsV1(nums);
    }

    /**
     * 回溯
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsV1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sub(nums, new Stack<Integer>(), 0, result);
        return result;
    }

    /**
     * 回溯遍历
     * @param nums
     * @param s
     * @param start
     * @param result
     */
    private void sub(int[] nums, Stack<Integer> s, int start, List<List<Integer>> result) {
        List<Integer> temp = new ArrayList<>(s);
        result.add(temp);
        if (s.size() < nums.length) {
            for (int i = start; i < nums.length; i++) {
                s.push(nums[i]);
                sub(nums, s, i + 1, result);
                s.pop();
            }
        }
    }

}
