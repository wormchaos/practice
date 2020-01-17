package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-17.
 */
public class Solution45 {

    /**
     * 贪心
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int end = 0;
        int max = 0;
        int step = 0;
        // 每次在end边界能到的最远距离
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if(i == end) {
                step++;
                end = max;
            }
        }
        return step;
    }

    /**
     * dp解最短次数(对于递减数组会超时)
     *
     * @param nums
     * @return
     */
    public int jumpV1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 0..x需要的最小步数
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = i;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] >= i - j) {
                    dp[i] = Math.min(dp[j] + 1, dp[i]);
                }
            }
        }
        return dp[nums.length - 1];
    }
}
