package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2019-12-26.
 * 二分查找边界
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        // 左边界
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                right = mid ;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            }
        }
        if(left <0 || left > nums.length - 1 || nums[left] != target) {
            result[0] =  -1;
        } else {
            result[0] = left;
        }
        if(result[0] == -1) {
            result[1] = -1;
            return result;
        }
        right = nums.length;
        while(left < right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                left = mid + 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            }
        }
        result[1] = left - 1;
        return result;
    }
}
