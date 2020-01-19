package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution416 {
    boolean hasResult = false;

    public boolean canPartition(int[] nums) {
        // 获取预期值
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (nums.length <= 1 || sum % 2 == 1) {
            return false;
        }
        // 找到数组值 等于总和一半即可
        sum /= 2;
        boolean[] marked = new boolean[nums.length];
        loop(nums, 0, sum, marked);
        return hasResult;

    }

    private void loop(int[] nums, int n, int sum, boolean[] marked) {
        if (n == sum) {
            hasResult = true;
            return;
        } else if (!hasResult && n < sum) {
            for (int i = 0; i < nums.length; i++) {
                if (!marked[i]) {
                    n += nums[i];
                    marked[i] = true;
                    loop(nums, n, sum, marked);
                    marked[i] = false;
                    n -= nums[i];
                }
            }
        }
    }
}
