package com.wormchaos.lc.sliding_window.normal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-1-21.
 */
public class Solution200 {


    public int numIslands(char[][] grid) {
        if (0 == grid.length || 0 == grid[0].length) {
            return 0;
        }
        int count = 0;
        int nc = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if ('1' == grid[i][j]) {
                    count++;
                    // 当前点是标记点
                    Queue<Integer> queue = new LinkedList<>();
                    grid[i][j] = '0';
                    queue.add(i * nc + j);
                    while (!queue.isEmpty()) {
                        int t = queue.poll();
                        int x = t / nc;
                        int y = t % nc;
                        if (x > 0 && grid[x - 1][y] == '1') {
                            queue.add((x - 1) * nc + y);
                            grid[x - 1][y] = '0';
                        }
                        if (x < grid.length - 1 && grid[x + 1][y] == '1') {
                            queue.add((x + 1) * nc + y);
                            grid[x + 1][y] = '0';
                        }
                        if (y > 0 && grid[x][y - 1] == '1') {
                            queue.add(x * nc + y - 1);
                            grid[x][y - 1] = '0';
                        }
                        if (y < grid[0].length - 1 && grid[x][y + 1] == '1') {
                            queue.add(x * nc + y + 1);
                            grid[x][y + 1] = '0';
                        }
                    }
                }
            }
        }
        return count;
    }
//    public int numIslands(char[][] grid) {
//        if(grid.length == 0 || grid[0].length == 0) {
//            return 0;
//        }
//        int count = 0;
//        boolean[][] marked = new boolean[grid.length][grid[0].length];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (!marked[i][j]) {
//                    dfs(grid, i, j, marked);
//                    if(grid[i][j] == '1') {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }
//
//    private void dfs(char[][] grid, int x, int y, boolean[][] marked) {
//        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1) {
//            return;
//        }
//        if (!marked[x][y] && grid[x][y] == '1') {
//            marked[x][y] = true;
//            dfs(grid, x - 1, y, marked);
//            dfs(grid, x + 1, y, marked);
//            dfs(grid, x, y - 1, marked);
//            dfs(grid, x, y + 1, marked);
//        }
//
//    }
}
