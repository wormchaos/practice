package com.wormchaos.lc.sliding_window;

import java.util.Arrays;

/**
 * Created by wormchaos on 2019-12-19.
 * 三数近似和
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        // 不考虑  < 3的场景
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int t = nums[l] + nums[r] + nums[i];
                if (t == target) {
                    return target;
                } else if (t > target) {
                    if (t < max) {
                        max = t;
                    }
                    r--;
                } else if (t < target) {
                    if (t > min) {
                        min = t;
                    }
                    l++;
                }
            }
        }
        if(min == Integer.MIN_VALUE) {
            return max;
        }
        if(max == Integer.MAX_VALUE) {
            return min;
        }
        return max - target > target - min ? min : max;
    }
}
