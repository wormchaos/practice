package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-3-18.
 */
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int totalSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int times = nums[i];
            totalSize += times;
        }
        int[] result = new int[totalSize];

        int current = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int times = nums[i];
            int num = nums[i + 1];
            for (int j = 0; j < times; j++) {
                result[current] = num;
                current++;
            }
        }
        return result;
    }
}
