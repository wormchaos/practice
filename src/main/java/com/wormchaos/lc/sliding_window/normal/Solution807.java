package com.wormchaos.lc.sliding_window.normal;

import java.util.Map;

/**
 * Created by wormchaos on 2020-3-17.
 */
public class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid[0].length];
        int[] column = new int[grid.length];
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] > row[j]) {
                    row[j] = grid[i][j];
                }
                if(grid[i][j] > column[i]) {
                    column[i] = grid[i][j];
                }
                sum += grid[i][j];
            }
        }
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                total += Math.min(row[j], column[i]);
            }
        }
        return total - sum;
    }
}
