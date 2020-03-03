package com.wormchaos.lc.sliding_window.normal;

import java.util.Arrays;

/**
 * Created by wormchaos on 2020-3-3.
 */
public class Solution75 {

    /**
     * @param nums
     */
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c1++;
            } else if (nums[i] == 2) {
                c2++;
            } else {
                c0++;
            }
        }
        for (int i = 0; i < c0; i++) {
            nums[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            nums[i] = 1;
        }
        for (int i = c0 + c1; i < c0 + c1 + c2; i++) {
            nums[i] = 2;
        }

    }
}
