package com.wormchaos.lc.sliding_window.hard;


/**
 * Created by wormchaos on 2020-1-3.
 */
public class Solution52 {

    int sum = 0;

    public int totalNQueens(int n) {
        // 当前点是否有Q
        boolean[][] q = new boolean[n][n];
        // 是否可以放置
        int[][] f = new int[n][n];
        queryQueen(q, f, 0, n);
        return sum;
    }

    private void queryQueen(boolean[][] q, int[][] f, int row, int n) {
        if (row == n) {
            sum++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (f[row][i] == 0) {
                addToPos(q, f, row, i);
                queryQueen(q, f, row + 1, n);
                removeToPos(q, f, row, i);
            }
        }

    }

    private void addToPos(boolean[][] q, int[][] f, int row, int column) {
        q[row][column] = true;
        for (int i = 0; i < f.length; i++) {
            f[i][column] += 1;
            f[row][i] += 1;
            if (row + column - i >= 0 && row + column - i <= f.length - 1) {
                f[i][row + column - i] += 1;
            }
            if (i - row + column >= 0 && i - row + column <= f.length - 1) {
                f[i][i - row + column] += 1;
            }
        }
    }

    private void removeToPos(boolean[][] q, int[][] f, int row, int column) {
        q[row][column] = false;
        for (int i = 0; i < f.length; i++) {
            f[i][column] -= 1;
            f[row][i] -= 1;
            if (row + column - i >= 0 && row + column - i <= f.length - 1) {
                f[i][row + column - i] -= 1;
            }
            if (i - row + column >= 0 && i - row + column <= f.length - 1) {
                f[i][i - row + column] -= 1;
            }
        }
    }
}
