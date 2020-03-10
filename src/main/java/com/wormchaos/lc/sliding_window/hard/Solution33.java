package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution33 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if(nums[mid] == target) {
                return mid;
            } else {
                // l 和mid之间
                boolean f1 = nums[l] < nums[mid] && target >= nums[l];
                boolean f2 = nums[l] > nums[mid] && target >= nums[l];
                boolean f3 = nums[mid] > nums[r] && target >= nums[r];
                if (f1 || f2 || f3) {
                    r = mid - 1;
                }
                // mid 和r之间
                boolean ff1 = nums[mid] < nums[r] && target < nums[r];
                boolean ff2 = nums[mid] > nums[r] && target < nums[r];
                boolean ff3 = nums[mid] < nums[l] && target < nums[l];
                if (ff1 || ff2 || ff3) {
                    l = mid + 1;
                }
            }
        }
        return -1;

    }
}
