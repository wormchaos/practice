package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-25. 
 * 最大子数组
 */
public class Solution53 {
    /**
     * 分治法
     */
    public int maxSubArray(int[] nums) {
        return max(nums, 0, nums.length - 1);
    }

    private int max(int[] nums, int left, int right) {
        if(left == right) {
            return nums[left];
        }
        int k = (left + right) / 2;
        int leftSum = max(nums, left, k);
        int rightSum = max(nums, k+1, right);
        int crossSum = max(nums, left, right, k);

        return Math.max(leftSum, Math.max(rightSum, crossSum));
    }
    
    private int max(int[] nums, int left, int right, int k) {
        if(left == right) {
            return nums[left];
        }
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = k-1; i>=left;i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = k+1; i<=right;i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        return left + k + right;
    
    }


    /**
     * dp思路
     */
    public int maxSubArrayVBest(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int num : nums) {
            sum = sum > 0 ? sum+num : num;
            max = Math.max(sum, max);
        }
        return max;
    }


    /**
     * 内存容易溢出
     * n^2
     */
    public int maxSubArrayV1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[][] c = new int[nums.length][nums.length];
        for(int i=0; i< nums.length; i++) {
            c[i][i] = nums[i];
            if(c[i][i] > max) {
                max = c[i][i];
            }
        }
        for(int k =1; k< nums.length; k++) {
            for(int i=0; i< nums.length - k; i++) {
                c[i][i+k] = c[i][i+k-1] + nums[i+k];
                if(c[i][i+k] > max) {
                    max = c[i][i+k];
                }
            }
        }
        return max;
    }
}
