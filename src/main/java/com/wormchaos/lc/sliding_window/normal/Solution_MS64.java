package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution_MS64 {
        public int sumNums(int n) {
            boolean b = (n > 0) && ((n += sumNums(n - 1)) > 0);
            return n;
        }

}
