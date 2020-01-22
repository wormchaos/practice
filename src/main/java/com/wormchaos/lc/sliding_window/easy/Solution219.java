package com.wormchaos.lc.sliding_window.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2020-1-22.
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0 || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k ) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
