package com.wormchaos.lc.sliding_window.normal;

import java.util.Arrays;

/**
 * Created by wormchaos on 2020-1-14.
 */
public class Solution56 {

    // TODO 栈思路
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals[0].length == 0) {
            return intervals;
        }
        // 做排序
//        for (int i = 0; i < intervals.length; i++) {
//            int k = i;
//            for (int j = i + 1; j < intervals.length; j++) {
//                if (intervals[j][0] < intervals[k][0]) {
//                    k = j;
//                }
//            }
//            int temp = intervals[k][0];
//            intervals[k][0] = intervals[i][0];
//            intervals[i][0] = temp;
//            int temp2 = intervals[k][1];
//            intervals[k][1] = intervals[i][1];
//            intervals[i][1] = temp2;
//        }
        // 排序
//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        boolean[] isLose = new boolean[intervals.length];
        int count = intervals.length;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i + 1][0] == intervals[i][0]) {
                intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);
                isLose[i] = true;
                count--;
            } else {
                if (intervals[i + 1][0] <= intervals[i][1]) {
                    intervals[i + 1][0] = intervals[i][0];
                    intervals[i + 1][1] = Math.max(intervals[i][1], intervals[i + 1][1]);
                    isLose[i] = true;
                    count--;
                }
            }
        }
        int[][] result = new int[count][2];
        int t = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (!isLose[i]) {
                result[t][0] = intervals[i][0];
                result[t][1] = intervals[i][1];
                t++;
            }
        }
        return result;

    }
}
