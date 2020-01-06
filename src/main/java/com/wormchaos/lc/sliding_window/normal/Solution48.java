package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-6.
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int len = n % 2 == 0 ? 1 : 0;
        for (int i = (n + 1) / 2 - 1; i >= 0; i--) {
            // 以matrix[i][i]为一层
            for (int j = 0; j < len; j++) {
                int temp = matrix[i + j][i];
                matrix[i + j][i] = matrix[i + len][i + j];
                matrix[i + len][i + j] = matrix[i + len - j][i + len];
                matrix[i + len - j][i + len] = matrix[i][i + len - j];
                matrix[i][i + len - j] = temp;
            }
            len += 2;
        }
    }
}
