package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-7.
 */
public class Solution264 {
    public int nthUglyNumber(int n) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[i2] * 2, dp[i3] * 3), dp[i5] * 5);
            while (dp[i2] * 2 <= dp[i]) {
                i2++;
            }
            while (dp[i3] * 3 <= dp[i]) {
                i3++;
            }
            while (dp[i5] * 5 <= dp[i]) {
                i5++;
            }
        }
        return dp[n - 1];
    }

    /**
     * 依次遍历
     *
     * @param n
     * @return
     */
    public int nthUglyNumberV1(int n) {
        // 第i个数乘2,3,5之后的结果
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int num1 = 1;
            for (int j = 0; j < i; j++) {
                if (dp[j] * 2 > dp[i - 1]) {
                    num1 = dp[j] * 2;
                    break;
                }
            }
            int num2 = 1;
            for (int j = 0; j < i; j++) {
                if (dp[j] * 3 > dp[i - 1]) {
                    num2 = dp[j] * 3;
                    break;
                }
            }
            num1 = Math.min(num1, num2);
            num2 = 1;
            for (int j = 0; j < i; j++) {
                if (dp[j] * 5 > dp[i - 1]) {
                    num2 = dp[j] * 5;
                    break;
                }
            }
            num1 = Math.min(num1, num2);
            dp[i] = num1;
        }
        return dp[n - 1];
    }
//    1.采用动态规划思想，假设要找下标i对应的丑数dp[i],可以用i之前的所有丑数乘若干个2直到大于上一个丑数dp[i-1]，记此数为num1;同理用i之前的所有丑数乘若干个3直到大于上一个丑数dp[i-1]，记此数为num2；
// 用i之前的所有丑数乘若干个5直到大于上一个丑数dp[i-1]，记此数为num3。这三个数中的最小数字就是第i个丑数dp[i]。
//    2.但是呢，其实没必要把i之前的所有丑数乘2或者乘3或者乘5**。****在i之前的丑数中，肯定存在一个丑数（下标记为index2），乘2以后正好大于i的上一个丑数dp[i-1],index2之前的丑数乘2都小于等于dp[i-1]**;
// 我们只需要记录index2，每次直接用这个下标对应的数乘2就行，并且在下标不满足时更新下标。同理我们也要记录乘3和乘5对应的下标。
//
//    作者：fu-xi-bei-kao-de-long-long
//    链接：https://leetcode-cn.com/problems/ugly-number-ii/solution/cchou-shu-by-fu-xi-bei-kao-de-long-long/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
