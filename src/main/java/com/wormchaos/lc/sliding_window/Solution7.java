package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-18.
 * 整数反转
 */
public class Solution7 {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int i = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int result = 0;
        while(x> 0) {
            int c = x %10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + c;

        }
        return result * i;
    }
}
