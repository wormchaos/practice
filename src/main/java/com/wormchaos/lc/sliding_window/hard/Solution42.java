package com.wormchaos.lc.sliding_window.hard;

/**
 * Created by wormchaos on 2020-1-13.
 * 连续递增/递减
 */
public class Solution42 {
    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }
//        int left = 0;
//        int right = 0;
        // left[x] 表示x的左最大高度
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length - 1; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            sum += Math.min(left[i], right[i]) - height[i];
        }

        return sum;
    }
}
