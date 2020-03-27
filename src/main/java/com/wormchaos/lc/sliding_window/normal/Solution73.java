package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-27.
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        // 标记行列状态
        boolean row = false;
        boolean column = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                row = true;
                break;
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                column = true;
                break;
            }
        }
        // 重新规划行列
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j<matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i <matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (row) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (column) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
