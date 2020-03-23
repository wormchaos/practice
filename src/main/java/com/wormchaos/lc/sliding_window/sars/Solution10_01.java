package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-3.
 */
public class Solution10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        if(n == 0) {
            return;
        }
        if(m == 0) {
            for (int i =0; i< n; i++) {
                A[i] = B[i];
            }
            return;
        }
        int p0 = m - 1;
        int p1 = n - 1;
        for (int i = 0; i < n + m; i++) {
            if (B[p1] > A[p0]) {
                A[m + n - 1 - i] = B[p1];
                p1--;
            } else {
                A[m + n - 1 - i] = A[p0];
                p0--;
            }
            if (p0 < 0 || p1 < 0) {
                break;
            }
        }
        if (p0 < 0) {
            for (int i =0; i< p1; i++) {
                A[i] = B[i];
            }
        }

    }
}
