package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-29.
 * 最大差
 */
public class Solution70 {
    /**
     * 斐波那契数列
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for(int i=3;i<=n;i++) {
            second = second + first;
            first = second;
        }
        return second;
    }

    /**
     * dp
     * @param n
     * @return
     */
    public int climbStairsV1(int n) {
        int[] dp = new int[n +1];
        for(int i=0;i<=n; i++) {
            if(i <=2) {
                dp[i] = i;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

}
