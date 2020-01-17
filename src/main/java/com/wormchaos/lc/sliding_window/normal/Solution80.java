package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-17.
 */
public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 0;
        while (q < nums.length) {
            if (q < nums.length - 1 && nums[q + 1] == nums[q]) {
                for (int i =0; i< 2; i++) {
                    nums[p] = nums[q];
                    p++;
                }
                while(q < nums.length - 1 && nums[q] == nums[q+1]) {
                    q++;
                }
                q++;
            } else {
                nums[p] = nums[q];
                p++;
                q++;
            }

        }
        return p;
    }
}
