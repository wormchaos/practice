package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.jar.Pack200;

/**
 * Created by wormchaos on 2020-1-2.
 */
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> s = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        boolean[] used = new boolean[nums.length];
        permute(nums, s, used, 0, result);
        return result;

    }

    private void permute(int[] nums, Stack<Integer> s, boolean[] used, int current, List<List<Integer>> result) {
        if (s.size() == nums.length) {
            List temp = new ArrayList(s);
            result.add(temp);
        } else {
            for (int i = current; i < nums.length; i++) {
                if(!used[i]) {
                    if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                        continue;
                    }
                    s.push(nums[i]);
                    used[i] = true;
                    permute(nums, s, used, 0, result);
                    used[i] = false;
                    s.pop();
                }
            }
        }
    }
}
