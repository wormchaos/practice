package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-7.
 */
public class Solution375 {
    /**
     * @param n
     * @return
     */
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        // 不能根据左右来计算，因为左右可能会得到未计算的0长度值
        // 设开始s,长度len
        for (int len = 2; len <= n; len++) {
            for (int s = 1; s <= n - len + 1; s++) {
                int min = Integer.MAX_VALUE;
                for (int k = (2 * s + len - 1) / 2; k < s + len - 1; k++) {
                    int t = Math.max(dp[s][k - 1], dp[k + 1][s + len - 1]) + k;
                    if (t < min) {
                        min = t;
                    }
                }
                dp[s][s + len - 1] = min;

            }
        }

        return dp[1][n];
    }

    private int getMoney(int l, int r, int[][] dp) {
        if (r == l) {
            return 0;
        }
        if (r - l == 1) {
            return l;
        }
        if (r - l == 2) {
            return l + 1;
        }
        if (r - l == 3) {
            return l + l + 2;
        }
        if (0 != dp[r][l]) {
            return dp[r][l];
        }
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i < r - 1; i++) {
            int result = Math.max(getMoney(l, i - 1, dp), getMoney(i + 1, r, dp)) + i;
            if (result < min) {
                min = result;
            }
        }
        dp[l][r] = min;
        return min;
    }
}
