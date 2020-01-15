package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-15.
 */
public class Solution91 {

    public int numDecodings(String s) {
        // [n,len]之间有多少解法
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        for (int l = s.length() - 1; l >= 0; l--) {
            if (s.charAt(l) == '0') {
                dp[l] = 0;
            } else if (l == s.length() - 1) {
                dp[l] = 1;
            } else if (s.charAt(l) < '2' || (s.charAt(l) == '2' && s.charAt(l+1) <= '6')) {
                dp[l] = dp[l + 1] + dp[l + 2];
            } else {
                dp[l] = dp[l + 1];
            }
        }
        return dp[0];
    }
}
