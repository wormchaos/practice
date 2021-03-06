package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020/1/24.
 */
public class Solution665 {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <= 2) {
            return true;
        }
        int p = -1;
        for (int i=0; i<nums.length -1; i++) {
            if (nums[i] > nums[i+1]) {
                if(p >= 0) {
                    return false;
                }
                p = i;
            }
        }
        if(p <= 0 || p == nums.length - 1) {
            return true;
        }
        if(nums[p -1] <= nums[p+1]) {
            return true;
        }
        if(p + 2 == nums.length) {
            return true;
        }
        return nums[p] <= nums[p+2];
    }
    public boolean checkPossibilityV1(int[] nums) {
        if(nums.length <= 2) {
            return true;
        }
        int l =0;
        int r = nums.length - 1;
        while(l + 2 < nums.length) {
            if(nums[l] <= nums[l + 1] && nums[l+1] <= nums[l+2]) {
                l++;
            } else {
                break;
            }
        }
        while (r - 2 >=l) {
            if(nums[r-2] <= nums[r-1] && nums[r-1] <= nums[r]) {
                r--;
            } else {
                break;
            }
        }
        if(l == r) {
            return true;
        }

        // 在l-r范围
        for (int i = l; i <= r; i++) {
            boolean f = true;
            int temp = nums[i];
            if(i == r) {
               nums[i] = Integer.MAX_VALUE;
            } else {
               nums[i] = i == 0 ? 0 : nums[i+1];
            }
            for (int j = l; j < r; j++) {
                if(nums[j] > nums[j+1]) {
                    f = false;
                    break;
                }
            }
            if(f) {
                return true;
            }
            nums[i] = temp;
        }
        return false;

    }
}
