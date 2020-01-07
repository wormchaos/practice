package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-7.
 */
public class Solution1219 {

    private int max = 0;

    /**
     * 最长图路径
     *
     * @param grid
     * @return
     */
    public int getMaximumGold(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int[][] c = new int[grid.length][grid[0].length];
        boolean[][] f = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    cal(grid, i, j, c, 0);
                }
            }
        }
        return max;
    }

    /**
     * 任意一点到x,y的最长距离
     *
     * @param grid
     * @param x
     * @param y
     */
    private void cal(int[][] grid, int x, int y, int[][] c, int current) {
        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1) {
            return;
        }
        if (0 == grid[x][y]) {
            return;
        }
        current += grid[x][y];
        if (current > max) {
            max = current;
        }
        int value = grid[x][y];
        grid[x][y] = 0;
        cal(grid, x, y - 1, c, current);
        cal(grid, x, y + 1, c, current);
        cal(grid, x + 1, y, c, current);
        cal(grid, x - 1, y, c, current);
        grid[x][y] = value;
    }
}
