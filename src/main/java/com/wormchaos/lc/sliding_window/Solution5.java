package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-17.
 * 回文数
 */
public class Solution5 {

    /**
     * 中心拓展
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if(s.length() == 0) {
            return s;
        }
        int start = 0;
        int end = 0;
        //拓展中心
        for (int i = 0; i < s.length(); i++) {
            // i和i+1之间
            int max1 = extend(s, i, i + 1) * 2;
            // i+1做中心
            int max2 = 2 * extend(s, i, i) - 1;
            int maxT = Math.max(max1, max2);
            if (maxT > end - start) {
                start = i - (maxT - 1) / 2;
                end = i + maxT / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int extend(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            count++;
        }
        return count;
    }

    /**
     * dp
     *
     * @param s
     * @return
     */
    public String longestPalindrome_DP(String s) {
        String maxString = "";
        boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];
        for (int len = 1; len <= s.length(); len++) {
            boolean f = false;
            for (int left = 0; left <= s.length() - len; left++) {
                int right = left + len - 1;
                if (len == 1) {
                    dp[left][right] = true;
                    dp[left + 1][left] = true;
                } else {
                    dp[left][right] = dp[left + 1][right - 1] && s.charAt(left) == s.charAt(right);
                }
                if (dp[left][right] && !f) {
                    f = true;
                    maxString = s.substring(left, right + 1);
                }
            }
        }
        return maxString;
    }

    /**
     * 暴力
     *
     * @param s
     * @return
     */
    public String longestPalindromeV1(String s) {
        if (s.length() == 0) {
            return "";
        }
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) s.charAt(i);
        }
        int max = 0;
        String result = "";
        Boolean[][] c = new Boolean[a.length][a.length];
        isLoop(a, 0, a.length - 1, c);
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= i; j--) {
                if (isLoop(a, i, j, c)) {
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }

    private boolean isLoop(int[] a, int i, int j, Boolean[][] c) {
        if (null != c[i][j]) {
            return c[i][j];
        }
        if (i == j) {
            c[i][j] = true;
            return c[i][j];
        }
        if (i + 1 == j) {
            c[i][j] = a[i] == a[j];
            return c[i][j];
        }
        c[i][j] = isLoop(a, i + 1, j - 1, c);
        c[i][j] = a[i] == a[j] && c[i][j];
        return c[i][j];

    }
}
