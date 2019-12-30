package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-29.
 * 不相邻最大和
 */
public class Solution198 {

    public int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : num) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }

    public int robV1(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int max[] = new int[nums.length];
        max[0] = nums[0];
        if(nums.length == 1) {
            return nums[0];
        }
        max[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i< nums.length; i++) {
            max[i] = Math.max(max[i-1], max[i - 2] + nums[i]);
        }    
        return max[nums.length - 1];
    }
    

}
