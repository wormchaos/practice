package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-31.
 */
public class Solution912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] a, int start, int end) {
        int l = start;
        int r = end;
        if (start < end) {
            int temp = a[l];
            while (l < r) {
                while (l <r && a[r] > temp) {
                    r--;
                }
                if (l < r) {
                    a[l] = a[r];
                    l++;
                }
                while (l < r && a[l] < temp) {
                    l++;
                }
                if (l < r) {
                    a[r] = a[l];
                    r--;
                }
            }
            a[r] = temp;
            quickSort(a, start, l - 1);
            quickSort(a, l + 1, end);
        }
    }
}
