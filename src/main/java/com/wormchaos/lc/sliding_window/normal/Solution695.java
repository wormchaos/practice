package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-16.
 */
public class Solution695 {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, getArea(grid, i, j));
                }
            }
        }
        return max;
    }

    private int getArea(int[][] grid, int i, int j) {
        if(i >=0 && j >=0 && i < grid.length && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            int sum = 1;
            sum += getArea(grid, i -1, j);
            sum += getArea(grid, i +1, j);
            sum += getArea(grid, i, j-1);
            sum += getArea(grid, i, j+1);
            return sum;
        }
        return 0;
    }


//    private int area;
//    public int maxAreaOfIsland(int[][] grid) {
//        int max = 0;
//        boolean[][] marked = new boolean[grid.length][grid[0].length];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if(!marked[i][j] && grid[i][j] == 1) {
//                    area = 0;
//                    getArea(grid, marked, i, j);
//                    if(area > max) {
//                        max = area;
//                    }
//                }
//            }
//        }
//        return max;
//    }
//
//    private void getArea(int[][] grid, boolean[][] marked, int i, int j) {
//        if(i >=0 && j >=0 && i < grid.length && j < grid[0].length && grid[i][j] == 1 && !marked[i][j]) {
//            area++;
//            marked[i][j] = true;
//            getArea(grid, marked, i-1, j);
//            getArea(grid, marked, i+1, j);
//            getArea(grid, marked, i, j-1);
//            getArea(grid, marked, i, j+1);
//        }
//    }
}
