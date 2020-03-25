package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-25.
 */
public class Solution892 {
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] > 0) {
                    sum += 3 * grid[i][j];
                    sum -= grid[i][j] - 1;
                    if(i + 1 < grid.length) {
                        sum -= Math.min(grid[i][j], grid[i+1][j]);
                    }
                    if(j + 1 < grid[i].length) {
                        sum -= Math.min(grid[i][j], grid[i][j+1]);
                    }
                }
            }
        }
        return sum * 2;
    }
}
