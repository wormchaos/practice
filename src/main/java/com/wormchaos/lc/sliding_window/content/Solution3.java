package com.wormchaos.lc.sliding_window.content;

import java.util.Map;

/**
 * Created by Raytine on 2020/4/18.
 */
public class Solution3 {
//    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
//        int c = 0;
//        int r = 0;
//        int h = 0;
//        int[] actived = new int[requirements.length];
//
//
//        for (int j = 0; j < requirements.length; j++) {
//            if (requirements[j][0] == 0 && requirements[j][1] == 0 && requirements[j][2] == 0) {
//                actived[j] = 0;
//            } else {
//                actived[j] = -1;
//            }
//        }
//
//        for (int i = 0; i < increase.length; i++) {
//            c += increase[i][0];
//            r += increase[i][1];
//            h += increase[i][2];
//            for (int j = 0; j < requirements.length; j++) {
//                if (actived[j] < 0 && requirements[j][0] <= c && requirements[j][1] <= r && requirements[j][2] <= h) {
//                    actived[j] = i+1;
//                }
//            }
//        }
//
//        return actived;
//    }

    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int n = 100000;
        // y = ca[x]，当值为x时是第y天
        int[] ca = new int[n];
        int[] ra = new int[n];
        int[] ha = new int[n];
        // 初始化-1.默认失效
        for (int i = 0; i < n; i++) {
            ca[i] = -1;
            ra[i] = -1;
            ha[i] = -1;
        }
        int c = 0;
        int r = 0;
        int h = 0;
        // 当值为c时，之前的都是i
        for (int i = 0; i < increase.length; i++) {
            for (int j = 0; j < increase[i][0]; j++) {
                ca[c + j] = i;
            }
            for (int j = 0; j < increase[i][1]; j++) {
                ra[r + j] = i;
            }
            for (int j = 0; j < increase[i][2]; j++) {
                ha[h + j] = i;
            }
            c += increase[i][0];
            r += increase[i][1];
            h += increase[i][2];
        }

        // 求出三个值最大值，即天数
        int[] result = new int[requirements.length];
        for (int i = 0; i < requirements.length; i++) {
            int t1 = ca[requirements[i][0]];
            int t2 = ra[requirements[i][1]];
            int t3 = ha[requirements[i][2]];
            if (t1 < 0|| t2 < 0 || t3 <0 ) {
                result[i] = -1;
            } else {
                result[i] = Math.max(Math.max(t1,t2 ),t3);
            }
        }
        return result;
    }
}
