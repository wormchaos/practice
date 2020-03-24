package com.wormchaos.lc.sliding_window.mensetsu;

/**
 * Created by wormchaos on 2020-3-24.
 */
public class Solution16_10 {

    /**
     * 按人头来算
     * @param birth
     * @param death
     * @return
     */
    public int maxAliveYear(int[] birth, int[] death) {
        // 1900 - 2000
        int[] dp = new int[102];
        for (int i = 0; i < birth.length; i++) {
            dp[birth[i] - 1900]++;
            dp[death[i] - 1900 + 1]--;
        }
        int max = 0;
        int year = 1900;
        int current = 0;
        for (int i = 0; i < dp.length; i++) {
            current += dp[i];
            if(current > max) {
                max = current;
                year = i;
            }
        }
        return year + 1900;
    }

    /**
     * 按总数来算
     * @param birth
     * @param death
     * @return
     */
    public int maxAliveYear_total(int[] birth, int[] death) {
        // 1900 - 2000
        int[] dp = new int[101];
        for (int i = 0; i < birth.length; i++) {
            for (int j = birth[i]; j <= death[i]; j++) {
                dp[j - 1900] ++;
            }
        }
        int max = 0;
        int year = 1900;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max) {
                max = dp[i];
                year = i;
            }
        }
        return year + 1900;
    }
}
