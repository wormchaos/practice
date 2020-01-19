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
        // 是否能找到和为i的
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        dp[nums[0]] = nums[0] <= sum;
        for (int i = 1; i < nums.length; i++) {
            // 从前往后会出现覆盖，比如 2,5,1 第一次遍历之后dp[2] = dp[4] = true
            for (int j = sum; j >= nums[i]; j--) {
                if(dp[sum]) {
                    return true;
                }
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum];
    }

    /**
     * 双数组dp
     *
     * @param nums
     * @return
     */
    public boolean canPartition_DP(int[] nums) {
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
            if (dp[i][sum]) {
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
