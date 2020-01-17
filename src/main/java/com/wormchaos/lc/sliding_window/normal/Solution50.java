package com.wormchaos.lc.sliding_window.normal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-1-17.
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−2^31, 2^31 − 1] 。
 * -32 < n < 32
 */
public class Solution50 {

    /**
     * 递归 x^a+b = x^a + x^b
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        boolean f = n < 0;
        boolean minFlag = false;
        if(n == Integer.MIN_VALUE) {
            n = Integer.MAX_VALUE;
            minFlag = true;
        } else {
            n = Math.abs(n);
        }
        Map<Integer, Double> dp = new HashMap<>();
        double sum = pow(x, n, dp);
        if(minFlag) {
            sum *= x;
        }
        if (f) {
            sum = 1 / sum;
        }
        return sum;

    }

    public double pow(double x, int n, Map<Integer, Double> dp) {
        if(dp.containsKey(n)) {
            return dp.get(n);
        }
        if(n == 1) {
            return x;
        }
        dp.put(n, pow(x, n / 2, dp) * pow(x, n - n / 2, dp));
        return dp.get(n);
    }


    /**
     * 暴力法
     * @param x
     * @param n
     * @return
     */
    public double myPowV1(double x, int n) {
        boolean f = n < 0;
        n = Math.abs(n);
        double sum = 1.00000d;
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                sum *= x;
            }
        }
        if (f) {
            sum = 1 / sum;
        }

        return sum;
    }
}
