package com.wormchaos.lc.sliding_window.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2020-4-14.
 */
public class Solution456 {
    public boolean find132pattern(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            left[i] = Integer.MAX_VALUE;
            right[i] = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && nums[j] < left[i]) {
                    left[i] = nums[j];
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i] && nums[j] > right[i]) {
                    right[i] = nums[j];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (left[i] < right[i]) {
                return true;
            }
        }
        return false;
    }
}
