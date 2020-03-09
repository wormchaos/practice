package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-21.
 */
public class Solution200 {

    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int count = 0;
        boolean[][] marked = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!marked[i][j]) {
                    dfs(grid, i, j, marked);
                    if(grid[i][j] == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int x, int y, boolean[][] marked) {
        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1) {
            return;
        }
        if (!marked[x][y] && grid[x][y] == '1') {
            marked[x][y] = true;
            dfs(grid, x - 1, y, marked);
            dfs(grid, x + 1, y, marked);
            dfs(grid, x, y - 1, marked);
            dfs(grid, x, y + 1, marked);
        }

    }
}
