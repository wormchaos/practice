package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-13.
 */
public class Solution44 {

    /**
     * dp优化
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        // ?匹配单个 *匹配0-n个
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        // 空串
        dp[n][m] = true;
        for (int i = n; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (p.charAt(j) == '?') {
                    dp[i][j] =  i < n && dp[i + 1][j + 1];
                } else if (p.charAt(j) == '*') {
                    // dp[i+1][j] = dp[i+2][j] || dp[i+1][j+1]
                    if(i == n) {
                        dp[i][j] = dp[i][j+1];
                    } else {
                        dp[i][j] = dp[i+1][j] || dp[i][j+1];
                    }
                } else {
                    dp[i][j] = i < n && s.charAt(i) == p.charAt(j) && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }

    /**
     * 自底向上
     * @param s
     * @param p
     * @return
     */
    public boolean isMatchV1(String s, String p) {
        // ?匹配单个 *匹配0-n个
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        // 空串
        dp[n][m] = true;
        for (int i = n; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (p.charAt(j) == '?') {
                    dp[i][j] =  i < n && dp[i + 1][j + 1];
                } else if (p.charAt(j) == '*') {
                    boolean flag = false;
                    for (int k = i; k <= n; k++) {
                        if (dp[k][j + 1]) {
                            flag = true;
                            break;
                        }
                    }
                    dp[i][j] = flag;
                } else {
                    dp[i][j] = i < n && s.charAt(i) == p.charAt(j) && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}
