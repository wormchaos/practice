package com.wormchaos.lc.sliding_window.hard;


/**
 * Created by wormchaos on 2020-1-15.
 */
public class Solution132 {

    /**
     * 单数组dp
     *
     * @param s
     * @return
     * @Solution5 最长回文子串
     */
    public int minCut(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 0...x需要的分割数
        // 若s[0,x]为回文，则dp[x]=0
        // 若分割s[j,x]为回文，则dp[x] = dp[j-1] + 1
        Boolean[][] isFlowArr = new Boolean[s.length()][s.length()];
        int[] dp = new int[s.length()];
        for (int i = 0; i < dp.length; i++) {
            if (isLoop(s, isFlowArr, 0, i)) {
                dp[i] = 0;
            } else {
                int min = i;
                for (int j = i; j > 0; j--) {
                    if(isLoop(s, isFlowArr, j, i)) {
                        if(min > dp[j - 1] + 1) {
                            min = dp[j - 1] + 1;
                        }
                    }
                }
                dp[i] = min;
            }
        }
        return dp[s.length() - 1];
    }

    private boolean isLoop(String s, Boolean[][] isFlowArr, int l, int r) {
        if (null == isFlowArr[l][r]) {
            // 判断0-i是否回文
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    isFlowArr[l][r] = false;
                    return false;
                }
                l++;
                r--;
            }
            isFlowArr[l][r] = true;
        }
        return isFlowArr[l][r];
    }

    /**
     * dp1，超时
     *
     * @param s
     * @return
     */
    public int minCutV1(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 得到解集[x][y] x-y之间可以分割最少dp[x][y]个回文
        int[][] dp = new int[s.length()][s.length()];
        int rst = merge(s, dp, 0, s.length() - 1);
        return rst - 1;
    }

    private int merge(String s, int[][] dp, int l, int r) {
        if (l > r || r >= s.length() || l >= s.length()) {
            return 0;
        }
        if (dp[l][r] > 0) {
            return dp[l][r];
        }
        if (l == r) {
            dp[l][r] = 1;
        } else {
            if (isValid(s, l, r)) {
                dp[l][r] = 1;
            } else {
                int min = r - l + 1;
                for (int i = l; i < r; i++) {
                    int t = merge(s, dp, l, i) + merge(s, dp, i + 1, r);
                    if (t < min) {
                        min = t;
                    }
                }
                dp[l][r] = min;
//            }
            }
        }
        return dp[l][r];
    }

    private boolean isValid(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
