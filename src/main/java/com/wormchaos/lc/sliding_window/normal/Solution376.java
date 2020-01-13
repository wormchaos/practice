package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-11.
 */
public class Solution376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <=1) {
            return nums.length;
        }
        int start = 0;
        int k = nums[0] < nums[1] ? 1 : -1;
        int max = 0;
        int sum = 0;
        for(int i = 0;i<nums.length-1;i++) {
            if((nums[i+1] - nums[i]) * k > 0) {
            } else {
                // if(i+1 - start > max) {
                //     max = i+1-start;
                // }
                // start = i+1;
                start = i+1;
                sum ++;
            }
        }
        return max == 0 ? nums.length : max;
    }
}
