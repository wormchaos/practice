package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21.
 * 删除数组重复项
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=1) {
            return nums.length;
        }

        int k = nums.length;
        for(int i=1; i< k;i++ ) {
            if(nums[i] == nums[i-1]) {
                for(int j=i;j<k-1;j++) {
                    nums[j] = nums[j + 1];
                }
                k--;
            }
        }
        return k;
    }

}
