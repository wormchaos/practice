package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2019-12-26.
 * 二分查找
 */
public class Solution704 {
    public int search(int[] nums, int target) {
        // 左右区间
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

}
