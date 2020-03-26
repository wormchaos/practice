package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-25.
 */
public class Solution877 {
    public boolean stoneGame(int[] piles) {
        // 取x-y时 0 -先手 1-后手能取到的最大值
        int[][][] dp = new int[piles.length][piles.length][2];
        int sum = 0;
        // 初始化
        for (int i = 1; i < piles.length; i++) {
            dp[i][i][0] = piles[i];
            dp[i][i][1] = 0;
            sum += piles[i];
        }

        for (int len = 2; len <= piles.length; len++) {
            for (int l = 0; l <= piles.length - len; l++) {
                int r = l + len - 1;
                if (len == 2) {
                    if (piles[l] > piles[l + 1]) {
                        dp[l][r][0] = piles[l];
                        dp[l][r][1] = piles[r];
                    } else {
                        dp[l][r][0] = piles[r];
                        dp[l][r][1] = piles[l];
                    }
                } else {
                    dp[l][r][0] = Math.max(piles[l] + dp[l + 1][r][1], piles[r] + dp[l][r - 1][1]);
                    dp[l][r][1] = Math.max(piles[l] + dp[l + 1][r][0], piles[r] + dp[l][r - 1][0]);
                }
            }
        }
        return dp[0][piles.length-1][0] * 2 > sum;
    }
}