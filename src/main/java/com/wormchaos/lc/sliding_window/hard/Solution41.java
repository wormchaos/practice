package com.wormchaos.lc.sliding_window.hard;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-10.
 */
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
//        检查 1 是否存在于数组中。如果没有，则已经完成，1 即为答案。
        boolean hasOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasOne = true;
                break;
            }
        }
        if (!hasOne) {
            return 1;
        }
//        如果 nums = [1]，答案即为 2 。
        if (n == 1) {
            return 2;
        }
//        将负数，零，和大于 n 的数替换为 1 。
        for (int i = 0; i < n; i++) {
            if(nums[i] <=0 || nums[i] > n) {
                nums[i] = 1;
            }
        }
//        遍历数组。当读到数字 a 时，替换第 a 个元素的符号。
//        注意重复元素：只能改变一次符号。由于没有下标 n ，使用下标 0 的元素保存是否存在数字 n。
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]);
            // 把第k个数放到k位置
            if(index == n) {
                nums[0] = - Math.abs(nums[0]);
            } else {
                nums[index] = - Math.abs(nums[index]);
            }
        }

//        再次遍历数组。返回第一个正数元素的下标。
        for (int i =1; i< n;i++) {
            if(nums[i] > 0) {
                return i;
            }
        }
//        如果 nums[0] > 0，则返回 n 。
        if(nums[0] > 0 ) {
            return n;
        }
//        如果之前的步骤中没有发现 nums 中有正数元素，则返回n + 1。

        return n + 1;
    }
}
