package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution416 {

    public boolean canPartition(int[] nums) {
        // 获取预期值
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (nums.length <= 1 || sum % 2 == 1) {
            return false;
        }
        // 找到数组值 等于总和一半即可
        sum /= 2;
        // define a,b - [0, a] value == sum
        boolean[][] dp = new boolean[nums.length][sum + 1];
        dp[0][0] = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (i == 0) {
                    dp[i][j] = j == nums[i];
                } else {
                    dp[i][j] = dp[i - 1][j] || (j > nums[i] && dp[i - 1][j - nums[i]]);
                }
            }
            if(dp[i][sum]) {
                return true;
            }
        }
        return dp[nums.length - 1][sum];

    }

    boolean hasResult = false;

    /**
     * 回溯(超时)
     *
     * @param nums
     * @return
     */
    public boolean canPartitionV1(int[] nums) {
        // 获取预期值
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (nums.length <= 1 || sum % 2 == 1) {
            return false;
        }
        // 找到数组值 等于总和一半即可
        sum /= 2;
        boolean[] marked = new boolean[nums.length];
        loop(nums, 0, sum, marked);
        return hasResult;

    }

    private void loop(int[] nums, int n, int sum, boolean[] marked) {
        if (n == sum) {
            hasResult = true;
            return;
        } else if (!hasResult && n < sum) {
            for (int i = 0; i < nums.length; i++) {
                if (!marked[i]) {
                    n += nums[i];
                    marked[i] = true;
                    loop(nums, n, sum, marked);
                    marked[i] = false;
                    n -= nums[i];
                }
            }
        }
    }
}
