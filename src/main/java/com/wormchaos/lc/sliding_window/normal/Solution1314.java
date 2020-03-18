package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution1314 {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        if(mat.length == 0 || mat[0].length == 0 || K == 0) {
            return mat;
        }
        // (x,y) 为 (9,0)左下顶点 (x-1, y-1)右上顶点的矩形和
        int[][] dp = new int[mat.length + 1][mat[0].length + 1];
        // 计算矩阵面积
        for (int i = 1; i <= mat.length; i++) {
            for (int j = 1; j <= mat[0].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }
        int[][] r = new int[mat.length][mat[0].length];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                int x1 = i - K > 0 ? i - K : 0;
                int y1 = j - K > 0 ? j - K  : 0;
                int x2 = i + K + 1 < mat.length ? i + K + 1 : mat.length;
                int y2 = j + K + 1 < mat[0].length ? j + K + 1 : mat[0].length;
                int result = dp[x2][y2] - dp[x1][y2] - dp[x2][y1] + dp[x1][y1];
                r[i][j] = result;
            }
        }
        return r;
    }
}
