package com.wormchaos.lc.sars;

import java.beans.Statement;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-9.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                continue;
            }
            if(prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
