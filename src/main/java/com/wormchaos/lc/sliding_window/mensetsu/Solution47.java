package com.wormchaos.lc.sliding_window.mensetsu;

/**
 * Created by wormchaos on 2020-3-26.
 */
public class Solution47 {
    public int maxValue(int[][] grid) {
        int[] dp = new int[grid.length];
        dp[0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i] = dp[i-1] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            dp[0] += grid[0][j];
            for (int i = 1; i < grid.length; i++) {
                dp[i] = Math.max(dp[i], dp[i-1]) + grid[i][j];
            }
        }
        return dp[grid.length - 1];
    }

    /**
     * 二维
     *
     * @param grid
     * @return
     */
    public int maxValue_D2(int[][] grid) {
        // 从0,0 到 x,y最大价值
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
