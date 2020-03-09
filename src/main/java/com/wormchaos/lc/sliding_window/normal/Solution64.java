package com.wormchaos.lc.sliding_window.normal;

import java.util.Arrays;

/**
 * Created by wormchaos on 2020-3-3.
 */
public class Solution64 {

    /**
     * 一维数组
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[] dp = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i == 0) {
                    dp[j] = (j == 0 ? 0 : dp[j - 1]) + grid[i][j];
                } else {
                    dp[j] = (j == 0 ? dp[j] : Math.min(dp[j-1], dp[j])) + grid[i][j];
                }
            }
//            for (int k=0; k < dp.length; k++) {
//                System.out.print(dp[k] + " ");
//            }
//            System.out.println();
        }
        return dp[grid[0].length - 1];
    }

    /**
     * 二维数组
     *
     * @param grid
     * @return
     */
    public int minPathSum_DP2(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        // x, y dp[x][y] = min(dp[x-1][y], dp[x][y-1]) + (x,y)
        dp[0][0] = grid[0][0];
        int min = loop(grid, grid.length - 1, grid[0].length - 1, dp);
        return min;
    }

    private int loop(int[][] grid, int x, int y, int[][] dp) {
        if (dp[x][y] == -1) {
            if (x == 0) {
                dp[x][y] = grid[x][y] + loop(grid, x, y - 1, dp);
            } else if (y == 0) {
                dp[x][y] = grid[x][y] + loop(grid, x - 1, y, dp);
            } else {
                dp[x][y] = Math.min(loop(grid, x, y - 1, dp), loop(grid, x - 1, y, dp)) + grid[x][y];
            }
        }
        return dp[x][y];
    }
}
