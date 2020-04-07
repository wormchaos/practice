package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-4-7.
 */
public class Solution01_07 {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int n = matrix.length;
        // 上下翻转
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                swap(matrix, i, j, n - 1 - i, j);
            }
        }
        // 中心对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    private void swap(int[][] matrix, int i, int j, int i1, int j1) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i1][j1];
        matrix[i1][j1] = temp;
    }
}