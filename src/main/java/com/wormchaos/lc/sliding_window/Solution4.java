package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-17.
 * 有序数组中位数
 */
public class Solution4 {

    /**
     * top k 思路
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        // 求中位数坐标 (n + m) / 2
        if((n + m) % 2 == 0) {
            int z = findTopK(nums1, 0, nums2, 0, (n + m) / 2);
            int z2 =  findTopK(nums1, 0, nums2, 0, (n + m) / 2 + 1);
            return (z + z2) / 2.0d;
        } else {
            return findTopK(nums1, 0, nums2, 0, (n + m) / 2 + 1);
        }

    }

    private int findTopK(int[] nums1, int l1, int[] nums2, int l2, int k) {
//        System.out.println(l1 + "_" + l2 + "_" + k);
        int r1 = nums1.length - 1;
        int r2 = nums2.length - 1;
        int len1 = r1 - l1 + 1;
        int len2 = r2 - l2 + 1;
        // 交换顺序，保证1数组先空
        if (len1 > len2) {
            return findTopK(nums2, l2, nums1, l1, k);
        }
        if (len1 == 0) {
            return nums2[l2 + k - 1];
        }

        if (k == 1) {
            return nums1[l1] < nums2[l2] ? nums1[l1] : nums2[l2];
        }

        int z1 = l1 + k / 2 - 1;
        if(z1 > r1) {
            z1 = r1;
        }
        int z2 = l2 + k / 2 - 1;
        if(z2 > r2) {
            z2 = r2;
        }
        if (nums1[z1] < nums2[z2]) {
            return findTopK(nums1, z1 + 1, nums2, l2, k - (z1 - l1 + 1 ));
        } else {
            return findTopK(nums1, l1, nums2, z2 + 1, k -(z2 - l2 + 1 ));
        }

    }

//    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
//        int len1 = end1 - start1 + 1;
//        int len2 = end2 - start2 + 1;
//        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
//        if (len1 > len2) {
//            return getKth(nums2, start2, end2, nums1, start1, end1, k);
//        }
//        // 某一段数组为空，说明不在该数组内，直接根据nums2取
//        if (len1 == 0) {
//            return nums2[start2 + k - 1];
//        }
//
//        // k为1，则判断两边top1
//        if (k == 1) {
//            return Math.min(nums1[start1], nums2[start2]);
//        }
//
//        int i = start1 + Math.min(len1, k / 2) - 1;
//        int j = start2 + Math.min(len2, k / 2) - 1;
//
//        // 尾递归
//        if (nums1[i] > nums2[j]) {
//            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
//        } else {
//            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
//        }
//    }

    /**
     * 第一版 O(n) 时间复杂度
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArraysV1(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] c = new int[n + m];
        int l1 = 0;
        int l2 = 0;
        for (int i = 0; i < n + m; i++) {
            if (l1 == n) {
                c[i] = nums2[l2];
                l2++;
                continue;
            }
            if (l2 == m) {
                c[i] = nums1[l1];
                l1++;
                continue;
            }
            if (nums1[l1] <= nums2[l2]) {
                c[i] = nums1[l1];
                l1++;
            } else {
                c[i] = nums2[l2];
                l2++;
            }
        }
        // 求中位数坐标 (n + m) / 2
        if ((n + m) % 2 == 0) {
            int z = (n + m) / 2;
            int z2 = (n + m) / 2 - 1;
            return (c[z] + c[z2]) / 2.0d;
        } else {
            int z = (n + m - 1) / 2;
            return c[z];
        }

    }
}
