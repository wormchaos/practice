package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-17.
 */
public class Solution1292 {
    public int maxSideLength(int[][] mat, int threshold) {
        int level;
        // (0,0)到(x,y)的sum和
        int[][] dp = new int[mat.length][mat[0].length];
        dp[0][0] = mat[0][0];
        for (int i = 1; i < mat.length; i++) {
            dp[i][0] = dp[i - 1][0] + mat[i][0];
        }
        for (int i = 1; i < mat[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + mat[0][i];
        }
        // 计算所有前缀和
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                // 当前位置移动
                dp[i][j] = mat[i][j] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
                min = Math.min(mat[i][j], min);
            }
        }
        if (min > threshold) {
            return 0;
        }
        // 从前缀和找到矩形
        for (level = 1; level <= Math.min(mat.length, mat[0].length); level++) {
            boolean flag = true;
            for (int i = 0; i < mat.length - level && flag; i++) {
                for (int j = 0; j < mat[0].length - level && flag; j++) {
//                    int t = dp[i+level][j+level] - dp[i + level][j - 1] - dp[i - 1][j + level] + dp[i - 1][j - 1];
                    int t;
                    if (i == 0) {
                        if (j == 0) {
                            t = dp[i + level][j + level];
                        } else {
                            t = dp[i + level][j + level] - dp[i + level][j - 1];
                        }
                    } else if (j == 0) {
                        t = dp[i + level][j + level] - dp[i - 1][j + level];
                    } else {
                        t = dp[i+level][j+level] - dp[i + level][j - 1] - dp[i - 1][j + level] + dp[i - 1][j - 1];
                    }
                    if (t <= threshold) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                level--;
                break;
            }
        }

        return level + 1;
    }
}
