package com.wormchaos.lc.sliding_window.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.jar.Pack200;

/**
 * Created by wormchaos on 2020-1-6.
 */
public class Solution496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 求连续数组长度
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i< nums2.length; i++) {
            // 比他小，直接丢进来，比他大则比较
            while(!stack.isEmpty() &&  nums2[i] > stack.peek()) {
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int[] c = new int[nums1.length];
        for (int i=0; i < nums1.length;i++) {
            c[i] = map.get(nums1[i]);
        }
        return c;
    }

//    public int[] nextGreaterElement(int[] findNums, int[] nums) {
//        Stack<Integer> stack = new Stack<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] res = new int[findNums.length];
//        for (int i = 0; i < nums.length; i++) {
//            while (!stack.empty() && nums[i] > stack.peek()) {
//                map.put(stack.pop(), nums[i]);
//            }
//            stack.push(nums[i]);
//        }
//        while (!stack.empty())
//            map.put(stack.pop(), -1);
//        for (int i = 0; i < findNums.length; i++) {
//            res[i] = map.get(findNums[i]);
//        }
//        return res;
//    }

    /**
     * 暴力法
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElementV1(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length];
        Arrays.fill(c, -1);
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            for (; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    break;
                }
            }
            for (int k = j; k < nums2.length; k++) {
                if (nums2[k] > nums2[j]) {
                    c[i] = nums2[k];
                    break;
                }
            }
        }
        return c;
    }
}
