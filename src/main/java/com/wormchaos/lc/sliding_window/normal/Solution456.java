package com.wormchaos.lc.sliding_window.normal;



/**
 * Created by wormchaos on 2020-4-14.
 */
public class Solution456 {
//    /**
//     * 单调栈获取最小值
//     * @param nums
//     * @return
//     */
//    public boolean find132pattern(int[] nums) {
//        Stack<Integer> stack = new Stack<>();
//        int min = nums[nums.length - 1];
//        for (int i = nums.length - 1; i >=0; i--) {
//            while (!stack.isEmpty()) {
//                if (stack.peek() > nums[i]) {
//                    right[stack.pop()] == nums[i];
//                }
//            }
//            stack.push(nums[i]);
//        }
//        return false;
//    }

    public boolean find132pattern_VSORT(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            left[i] = Integer.MAX_VALUE;
            right[i] = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && nums[j] < left[i]) {
                    left[i] = nums[j];
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i] && nums[j] > right[i]) {
                    right[i] = nums[j];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (left[i] < right[i]) {
                return true;
            }
        }
        return false;
    }
}
