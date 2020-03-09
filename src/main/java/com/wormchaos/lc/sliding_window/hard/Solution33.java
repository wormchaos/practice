package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution33 {
    public int search(int[] nums, int target) {
        // 正常二分，[l, r]
        int l = 0;
        int r = nums.length -1;
        // 判断所在区间是否是正常排序
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 找左区间的情况
            boolean b1 = nums[mid] < nums[r] && nums[mid] < target;
            // 该区间折叠
            boolean b2 = nums[mid] > nums[r] && nums[mid] < target;
            boolean f3 = nums[l] > nums[mid] && nums[mid] > target;
            if (b1 || b2 || f3) {
                l = mid + 1;
            }
            boolean f1 = nums[l] < nums[mid] && nums[mid] > target;
            // 折叠
            boolean f2 = nums[l] > nums[mid] && nums[mid] > target;
            boolean b3 = nums[mid] > nums[r] && nums[mid] < target;
            if (f1 && f2 && b3) {
                r = mid - 1;
            }
        }
        return l == r ? -1 : l;

    }
}
