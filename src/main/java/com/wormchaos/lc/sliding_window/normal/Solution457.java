package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-4-16.
 */
public class Solution457 {

    public boolean circularArrayLoop(int[] nums) {
        int[] next = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            next[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            int p = (nums[i] + i) % nums.length;
            if (p < 0) {
                p += nums.length;
            }
            if (i == p) {
                next[i] = -2;
            } else {
                next[i] = p;
            }
        }


        return false;
    }
//    public boolean circularArrayLoop(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int pre = i;
//            int p = (nums[pre] + pre) % nums.length;
//            if (p < 0) {
//                p = p + nums.length;
//            }
//            if (p == i) {
//                continue;
//            }
//            int count = 0;
//            while (nums[pre] * nums[p] > 0 && count < nums.length) {
//                pre = p;
//                p = (nums[pre] + pre) % nums.length;
//                if (p < 0) {
//                    p = p + nums.length;
//                }
//                if (p == i) {
//                    return true;
//                }
//                count++;
//            }
//        }
//        return false;
//    }
}
