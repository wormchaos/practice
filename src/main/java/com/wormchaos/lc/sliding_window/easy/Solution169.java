package com.wormchaos.lc.sliding_window.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-1-8.
 * >n/2的众数
 */
public class Solution169 {

    /**
     * 多数投票算法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 1;
        for (int i = 0;i <nums.length; i++) {
            if(maj == nums[i]) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                maj = nums[i];
                count++;
            }

        }
        return maj;
    }


    /**
     * 分治
     * @param nums
     * @return
     */
    public int majorityElementVMERGE(int[] nums) {
        return findNum(nums, 0, nums.length - 1);
    }

    private int findNum(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int mid = (l + r) / 2;
        int left = findNum(nums, l, mid);
        int right = findNum(nums, mid + 1, r);
        if (left == right) {
            return left;
        }
        int lCount = getCount(nums, l, mid, left);
        int rCount = getCount(nums, mid + 1, r, right);
        return lCount > rCount ? left : right;
    }

    private int getCount(int[] nums, int l, int r, int num) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if(num == nums[i]) {
                count++;
            }
        }
        return count;
    }

    public int majorityElementBySort(int[] nums) {
        // 先排序
        quickSort(nums, 0, nums.length - 1);
        // 取N/2
        return nums[nums.length / 2];

    }


    void quickSort(int a[], int low, int high) {
        int i, j, temp;
        i = low;
        j = high;
        if (low < high) {
            temp = a[low];    //设置枢轴
            while (i != j) {
                // 直到比temp小
                while (i < j && a[j] >= temp) {
                    --j;
                }
                if (i < j) {
                    a[i] = a[j];
                    ++i;
                }

                while (i < j && a[i] < temp) {
                    ++i;
                }
                if (i < j) {
                    a[j] = a[i];
                    --j;
                }
            }
            a[i] = temp;
            quickSort(a, low, i - 1);
            quickSort(a, i + 1, high);
        }
    }

    public int majorityElementV1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer t = map.get(nums[i]);
            if (null == t) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], t + 1);
            }
        }
        int max = 0;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
