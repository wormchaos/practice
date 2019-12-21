package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-21.
 * 删除数组重复项
 */
public class Solution26 {

    /**
     * 双指针优化
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length <=1) {
            return nums.length;
        }
        // 每次找到一个不一样的值便替换当前值和顺位
        int i=0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public int removeDuplicatesV1(int[] nums) {
        if(nums.length <=1) {
            return nums.length;
        }

        int k = nums.length;
        for(int i=1; i< k;i++ ) {
            if(nums[i] == nums[i-1]) {
                for(int j=i;j<k-1;j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                k--;
            }
        }
        return k;
    }

}
