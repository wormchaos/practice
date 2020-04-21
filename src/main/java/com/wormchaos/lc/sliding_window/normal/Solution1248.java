package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-4-21.
 */
public class Solution1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] a = new int[nums.length + 2];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                a[++c] = i;
            }
        }
        a[0] = -1;
        a[++c] = nums.length;
        int sum = 0;
        for(int i = 1; i < c - k+ 1; i++) {
            sum += (a[i] - a[i-1]) * (a[i + k] - a[i +k -1]);
        }
        return sum;

    }

    /**
     * dp效率低
     *
     * @param nums
     * @param k
     * @return
     */
    public int numberOfSubarrays_dp(int[] nums, int k) {
        int[] dp = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 0;
            for (int j = i; j < nums.length; j++) {
                if (j > i) {
                    dp[j] = dp[j - 1];
                }
                if (nums[j] % 2 == 1) {
                    dp[j]++;
                }
                if (dp[j] == k) {
                    count++;
                }
            }
        }
        return count;

    }
}
