package com.wormchaos.lc.sars;

/**
 * Created by wormchaos on 2020-3-11.
 */
public class Solution1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int avg = sum / 3;
        int current = 0;
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            current += A[i];
            if(current == avg) {
                current = 0;
                cnt++;
            }
        }
        return cnt >= 3;

    }
}
