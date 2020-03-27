package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-27.
 */
public class Solution96 {

    private int[] dp = new int[200];

    /**
     * 递归解树的全排列
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        if (dp[n] > 0) {
            return dp[n];
        }
        if (n <= 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numTrees(i) * numTrees(n - i - 1);
        }
        dp[n] = sum;
        return sum;
    }
}
