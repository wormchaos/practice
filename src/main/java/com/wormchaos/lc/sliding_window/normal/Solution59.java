package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] r = new int[n][n];
        int num = 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            // 从最外层开始，每层的数字范围
            int finish = 4 * (n - 2 * i - 1);
            for (int j = 1; j <= n - 1 - 2 * i; j++) {
                r[i][i + j] = num + j;
                // i
                r[i + j][n - 1 - i] = num + j + n - 1 - 2 * i;
                r[n - 1 - i][n - 1 - i - j] = num + j + 2 * (n - 1 - 2* i);
                r[n - 1 - i - j][i] = num + j + 3 * (n - 1 - 2* i);
            }
            r[i][i] = num;
            // 结束
            num += finish;
        }
        return r;

    }
}
