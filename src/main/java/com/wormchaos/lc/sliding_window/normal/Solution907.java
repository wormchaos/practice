package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-20.
 */
public class Solution907 {

    /**
     * 连续子数组
     *
     * @param A
     * @return
     */
    public int sumSubarrayMins(int[] A) {
        int mod = (int)Math.pow(10, 9) + 7;
        int result = 0;
        int[][] dp = new int[A.length][A.length];
        for (int len = 1; len <= A.length; len++) {
            for (int l = 0; l < A.length - len + 1; l++) {
                int r = l + len - 1;
                if(len == 1) {
                    dp[l][r] = A[l];
                } else {
                    dp[l][r] = Math.min(dp[l][r-1], A[r]);
                }
                result += dp[l][r];
                if(result >= mod) {
                    result %= mod;
                }
            }
        }
        return result;
    }
}
