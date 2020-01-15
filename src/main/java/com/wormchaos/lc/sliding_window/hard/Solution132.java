package com.wormchaos.lc.sliding_window.hard;


/**
 * Created by wormchaos on 2020-1-15.
 */
public class Solution132 {
    public int minCut(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 得到解集[x][y] x-y之间可以分割最少dp[x][y]个回文
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int len = 1; len <= s.length(); len++) {
            for (int p = 0; p < s.length() - len + 1; p++) {
                int e = p + len - 1;
                if (len == 1) {
                    dp[p][p] = 1;
                    dp[p + 1][p] = 1;
                } else {
                    dp[p][e] = dp[p + 1][e - 1] == 1 && s.charAt(p) == s.charAt(e) ? 1 : 0;
                }
            }
        }
        // 有向图
        int r = len(dp, 0, s.length() - 1);
        return r - 1;
    }

    private int len(int[][] dp, int l, int r) {
        if (dp[l][r] == 1) {
            return 1;
        } else if (dp[l][r] == 0) {
            int min = r - l + 1;
            int k = l;
            while (k < r) {
                int value = len(dp, l, k) + len(dp, k + 1, r);
                if (value < min) {
                    min = value;
                }
                k++;
            }
            dp[l][r] = min;
        }
        return dp[l][r];
    }
}
