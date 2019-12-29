package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-28.
 * 最大差
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int maxValue = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i< prices.length;i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            if(maxValue < prices[i] - min) {
                maxValue = prices[i] - min;
            }
        }
        return maxValue;
    }

}
