package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-29.
 * 搜索插入位置
 */
public class Solution35 {
    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        // 因为无重复元素，因此二分法区间可以定义为 [l, r]
        int l = 0;
        int r = nums.length - 1;
        int k = 0;
        while(l <= r) {
            k = (l + r) / 2;
            if(target == nums[k]) {
                return k;
            } else if(target < nums[k]) {
                r = k - 1;
            } else if(target > nums[k]) {
                l = k + 1;
            }
        }
        return l > r ? l : k;
    }

}
