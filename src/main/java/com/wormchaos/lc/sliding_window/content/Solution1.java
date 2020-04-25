package com.wormchaos.lc.sliding_window.content;

/**
 * Created by Raytine on 2020/4/18.
 */
public class Solution1 {
    public int minCount(int[] coins) {
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            sum += (coins[i] + 1) >> 1;
        }
        return sum;
    }
}
