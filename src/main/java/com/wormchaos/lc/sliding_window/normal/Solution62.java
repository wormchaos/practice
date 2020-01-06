package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-6.
 */
public class Solution62 {

    /**
     * dp
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        // 到达x,y点需要的步数c
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = c[i - 1][j] + c[i][j - 1];
                }
            }
        }
        return c[m - 1][n - 1];
    }
}
