package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-24.
 */
public class Solution29 {

    public int divide(int dividend, int divisor) {
        boolean sign = (dividend > 0) ^ (divisor > 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int i =0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            i++;
        }
        if(sign) {
            i = -i;
        }
        return i;
    }
}
