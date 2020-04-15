package com.wormchaos.lc.sliding_window.sars;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-4-15.
 */
public class Solution542 {


    public int[][] updateMatrix(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0) {
                    dp[i][j] = matrix.length + matrix[0].length - 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }
                if (j > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (i < matrix.length - 1) {
                    dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                }
                if (j < matrix[0].length - 1) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }
            }
        }
        return dp;
    }

    public int[][] updateMatrix_VERSION(int[][] matrix) {
        if (0 == matrix.length || 0 == matrix[0].length) {
            return matrix;
        }
        Queue<Integer> xQueue = new LinkedList<>();
        Queue<Integer> yQueue = new LinkedList<>();
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = -1;
                if (matrix[i][j] == 0) {
                    xQueue.add(i);
                    yQueue.add(j);
                }
            }
        }
        int level = 0;
        while (!xQueue.isEmpty()) {
            int size = xQueue.size();
            for (int i = 0; i < size; i++) {
                int x = xQueue.poll();
                int y = yQueue.poll();
                if (result[x][y] < 0) {
                    result[x][y] = level;
                }
                if (x > 0 && result[x - 1][y] < 0) {
                    xQueue.add(x - 1);
                    yQueue.add(y);
                }
                if (y > 0 && result[x][y - 1] < 0) {
                    xQueue.add(x);
                    yQueue.add(y - 1);
                }
                if (x < matrix.length - 1 && result[x + 1][y] < 0) {
                    xQueue.add(x + 1);
                    yQueue.add(y);
                }
                if (y < matrix[0].length - 1 && result[x][y + 1] < 0) {
                    xQueue.add(x);
                    yQueue.add(y + 1);
                }
            }
            level++;
        }
        return result;
    }

////    private int[] ip = new int[]{-1, 1, 0, 0};
////    private int[] jp = new int[]{0, 0, -1, 1};
//
//    private int[][] ip = new int[][]{{-1, 0}, {1, 0}, {1, 0}, {-1, 0}};
//    private int[][] jp = new int[][]{{0, -1}, {0, 1}, {0, -1}, {0, 1}};
//
//    public int[][] updateMatrix(int[][] matrix) {
//        if (0 == matrix.length || 0 == matrix[0].length) {
//            return matrix;
//        }
//        int[][] dp = new int[matrix.length][matrix[0].length];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j] = -1;
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                walk(matrix, dp, i, j, -1);
//            }
//        }
//        return dp;
//    }
//
//
//    private int walk(int[][] matrix, int[][] dp, int i, int j, int k) {
//        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
//            return Integer.MAX_VALUE - 1;
//        }
//        if (dp[i][j] < 0) {
//            if (matrix[i][j] == 0) {
//                dp[i][j] = 0;
//            } else {
//                int min = Integer.MAX_VALUE - 1;
//                if (k == -1) {
//                    for (k = 0; k < 4; k++) {
//                        min = Math.min(min, Math.min(walk(matrix, dp, i + ip[k][1], j + jp[k][1], k), walk(matrix, dp, i + ip[k][0], j + jp[k][0], k)));
//                    }
//                } else {
//                    min = Math.min(walk(matrix, dp, i + ip[k][1], j + jp[k][1], k), walk(matrix, dp, i + ip[k][0], j + jp[k][0], k));
//                }
//                dp[i][j] = min + 1;
//            }
//        }
//        return dp[i][j];
//    }
}
