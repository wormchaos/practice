package com.wormchaos.lc.sliding_window.hard;

import java.util.Arrays;

/**
 * Created by wormchaos on 2020-3-24.
 */
public class Solution891 {
    public int sumSubseqWidths(int[] A) {

        // TODO 数学方法
        long div = 1000000007;
        if (A.length <= 1) {
            return 0;
        }
        Arrays.sort(A);
        // 可能出现次数
        int sum = 0;
        for (int len = 2; len <= A.length; len++) {
            for (int l = 0; l < A.length - len + 1; l++) {
                for (int r = l + len - 1; r < A.length; r++) {
//                    if (r > 0 && A[r] == A[r - 1]) {
//                        continue;
//                    }
                    sum += (A[r] - A[l]);
                    if (sum > div) {
                        sum %= div;
                    }
                }
            }
        }
        return sum;
    }
}
