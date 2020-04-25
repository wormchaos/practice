package com.wormchaos.lc.sliding_window.content;

import java.util.Map;

/**
 * Created by Raytine on 2020/4/18.
 */
public class Solution4 {
    public int minJump(int[] jump) {
        if (jump.length == 0) {
            return 0;
        }
        // 到达i点需要的最少次数
        int[] dp = new int[jump.length];
        int times = 1;

        for (int i = jump.length - 1; i >= 0; i--) {
            if (i + jump[i] > jump.length - 1) {
                dp[i] = 1;
            }
        }
        while (times < jump.length){
            for (int i = jump.length - 1; i >= 0; i--) {
                if (i + jump[i] < jump.length  && dp[i + jump[i]] > 0) {
                    if (dp[i] == 0) {
                        dp[i] = times + dp[i + jump[i]];
                    } else {
                        dp[i] = Math.min(times + dp[i + jump[i]], dp[i]);
                    }
                }
            }
            times++;
        }
        int p;
        int min = dp[0] == 0 ? Integer.MAX_VALUE :dp[0];
        int minP = 0;
        int t = 1;
        int minSize = dp[0] == 0 ? Integer.MAX_VALUE :dp[0];
        int pre = 0;
//        while (pre + jump[pre] < jump.length && dp[pre] == 0) {
//            if (jump[pre] == 0) {
//                break;
//            }
//            pre = pre + jump[pre];
//            t++;
//        }
//        int size = dp[pre];
        for(int k = 0; k < jump.length; k++) {
            p = pre + jump[pre];
            if (p > dp.length - 1) {
                p = dp.length - 1;
            }
            for (int i = pre + 1; i < p; i++) {
                if (dp[i] > 0 && min > dp[i]) {
                    min = dp[i];
                    minP = i;
                }
            }
            pre = p;
            minSize = Math.min(dp[minP] + t + 1, minSize);
            t++;
        }

        return minSize;
    }
}
