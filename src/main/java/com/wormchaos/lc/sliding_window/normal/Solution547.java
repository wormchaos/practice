package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-16.
 */
public class Solution547 {
    public int findCircleNum(int[][] M) {
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if(M[i][i] == 1) {
                findSameGroup(M, i, i);
                count++;
            }
        }
        return count;
    }

    private void findSameGroup(int[][] m, int i, int j) {
        m[i][j] = 0;
        for (int k = 0; k < m[0].length; k++) {
            if(m[i][k] == 1) {
                findSameGroup(m, i, k);
            }
            if(m[k][j] == 1) {
                findSameGroup(m, k, j);
            }
        }
    }
}
