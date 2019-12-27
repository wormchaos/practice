package com.wormchaos.lc.sliding_window.easy;


import com.wormchaos.lc.toolbean.TreeNode;

/**
 * Created by wormchaos on 2019-12-28.
 * 最大差
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int value = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i< prices.length;i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            if(prices[i] > min) {
                value += prices[i] - min;
                min = prices[i];
            }
        }
        return value;
    }

}
