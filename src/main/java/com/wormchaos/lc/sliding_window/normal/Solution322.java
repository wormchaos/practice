package com.wormchaos.lc.sliding_window.normal;

import java.util.Arrays;
import java.util.jar.Pack200;

/**
 * Created by wormchaos on 2020-1-7.
 */
public class Solution322 {

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) {
            return 0;
        }
        // dp解
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] < dp.length) {
                dp[coins[i]] = 1;
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i > coins[j] && dp[i - coins[j]] != -1) {
                    int t = dp[i - coins[j]] + 1;
                    if (dp[i] == -1 || dp[i] > t) {
                        dp[i] = t;
                    }
                }
            }
        }
        return dp[amount];
    }

//    private int gcd(int[] coins) {
//        int t1 = coins[0];
//        int mul = coins[0];
//        for (int i = 1; i < coins.length; i++) {
//            t1 = gcd(coins[i], t1);
//            mul = mul * coins[i] / t1;
//        }
//        return mul;
//    }
//
//    private int gcd(int num1, int num2) {
//        while (num1 > 0 && num2 > 0) {
//            int t = num1;
//            num1 = num2 % num1;
//            num2 = t;
//        }
//        return num1 > 0 ? num1 : num2;
//    }
//
//    private void cal(int[] coins, int step, int amount) {
//        if (amount == 0) {
//            if (step < minStep) {
//                minStep = step;
//            }
//            return;
//        }
//        if (amount < 0) {
//            return;
//        }
//        for (int i = 0; i < coins.length; i++) {
//            cal(coins, step + 1, amount - coins[i]);
//        }
//    }
}
