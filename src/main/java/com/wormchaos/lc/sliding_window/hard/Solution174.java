package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-4-17.
 */
public class Solution174 {
    public int calculateMinimumHP(int[][] dungeon) {
        if(0 == dungeon.length || 0 == dungeon[0].length) {
            return 0;
        }
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for (int i = dungeon.length - 1; i >= 0; i--) {
            for (int j = dungeon[0].length - 1; j >= 0; j--) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = dungeon.length - 1; i >= 0; i--) {
            for (int j = dungeon[0].length - 1; j >= 0; j--) {
                if ( i == dungeon.length - 1) {
                    if (j == dungeon[0].length - 1) {
                        dp[i][j] = Math.max(1, 1 - dungeon[i][j]);
                    } else {
                        dp[i][j] = Math.max(1, dp[i][j + 1] - dungeon[i][j]);
                    }
                } else if (j == dungeon[0].length - 1) {
                    dp[i][j] = Math.max(1, dp[i + 1][j] - dungeon[i][j]);
                } else {
                    dp[i][j] = Math.min(dp[i][j], Math.max(1, Math.min(dp[i + 1][j], dp[i][j+1]) - dungeon[i][j]));
                }
            }
        }

        return dp[0][0];
    }
}
