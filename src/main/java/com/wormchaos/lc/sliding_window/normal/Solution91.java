package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-15.
 */
public class Solution91 {
    public int numDecodings(String s) {
        // [n,m]之间有多少解法
        int[][] dp = new int[s.length()][s.length()];
        for (int len = 1; len < s.length(); len++) {
            for (int l = s.length() - len; l >=0 ; l--) {
                int r = l + len - 1;
                if (len == 1) {
                    dp[l][r] = 1;
                } else if (len == 2) {
                    if (s.charAt(l) < '2' || (s.charAt(l) == '2' && s.charAt(r) <= '6')) {
                        dp[l][r] = 2;
                    } else {
                        dp[l][r] = 1;
                    }
                } else {
                    dp[l][r] = dp[l][l+1] * dp[l+2][r];
                }

            }
        }
        return dp[0][s.length() - 1];
    }
}
