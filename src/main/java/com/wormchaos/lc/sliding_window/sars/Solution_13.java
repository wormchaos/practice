package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-4-8.
 */
public class Solution_13 {

    private Integer count = 0;

    /**
     * dfs
     *
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        boolean[][] marked = new boolean[m][n];
        dfs(marked, 0, 0, m, n, k);
        return count;
    }

    private void dfs(boolean[][] marked, int x, int y, int m, int n, int k) {
        if (x >= 0 && y >= 0 && x < m && y < n && !marked[x][y]) {
            if (cnt(x) + cnt(y) > k) {
                return;
            }
            count++;
            marked[x][y] = true;
            dfs(marked, x + 1, y, m, n, k);
            dfs(marked, x - 1, y, m, n, k);
            dfs(marked, x, y + 1, m, n, k);
            dfs(marked, x, y - 1, m, n, k);
        }

    }

    private int cnt(int x) {
        int c = 0;
        while (x > 0) {
            c += x % 10;
            x /= 10;
        }
        return c;
    }
}
