package com.wormchaos.lc.sliding_window.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2020-1-22.
 */
public class Solution217 {

    /**
     * 是否有重复
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
