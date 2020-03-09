package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-1-21.
 */
public class Solution137 {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }
        int r = nums[0];
        for (int i =1; i< nums.length; i++) {
            r ^= nums[i];
        }
        return r;
    }
}
