package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2019-12-31.
 * n * m 矩阵找数
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int column = 0;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        while (column < matrix[0].length) {
            int num = matrix[row][column];
            if (target == num) {
                return true;
            }
            if (row < matrix.length - 1 && target >= matrix[row + 1][column]) {
                row++;
            } else {
                column++;
            }

        }
        return false;
    }
}
