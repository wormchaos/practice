package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-10.
 */
public class Solution55 {

    /**
     * 能超过0的点
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i=0; i<nums.length - 1;i++) {
            if(nums[i] == 0) {
                if(max <= i) {
                    return false;
                }
            } else {
                if( max < nums[i] + i ) {
                    max = nums[i] + i;
                }
            }
        }
        return true;
    }

    //官方贪心
//    public class Solution {
//        public boolean canJump(int[] nums) {
//            int lastPos = nums.length - 1;
//            for (int i = nums.length - 1; i >= 0; i--) {
//                if (i + nums[i] >= lastPos) {
//                    lastPos = i;
//                }
//            }
//            return lastPos == 0;
//        }
//    }
}
