package com.wormchaos.lc.sliding_window.mensetsu;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-26.
 */
public class Solution61 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        // 某个数后面的最大数
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = dp[i-1];
            if (min > prices[i]) {
                min = prices[i];
                continue;
            }
            if(prices[i] - min > dp[i]) {
                dp[i] = prices[i] - min;
            }
        }
        return dp[prices.length - 1];
    }
}
