package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-2.
 * n个数中k个长度数组合
 */
public class Solution77 {

    public List<List<Integer>> combine(int n, int k) {
        if(n < 30) {
            return combineV2(n, k);
        } else {
            return combineV1(n, k);
        }
    }

    /**
     * 小于maxInt的场景
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combineV2(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] c = new int[1 << n];
        c[0] = 0;
        c[1] = 1;
        for (int i = 1; i < 1 << n; i++) {
            c[i] = c[i >> 1];
            if(c[i] > k) {
                continue;
            }
            if((i & 1) == 1) {
                c[i] += 1;
            }
            if(c[i] == k) {
                add(i, result);
            }
        }
        return result;
    }

    private void add(int n, List<List<Integer>> result) {
        int i = n;
        List<Integer> list = new LinkedList<>();
        int sum = 0;
        while (i > 0) {
            sum++;
            if ((i & 1) == 1) {
                list.add(sum);
            }
            i = i >> 1;
        }
        result.add(list);
    }

    public List<List<Integer>> combineV1(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n > 0 && k <= n) {
            boolean[] used = new boolean[n];
            Stack<Integer> s = new Stack<>();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i + 1;
            }
            calK(nums, k, 0, used, s, result);
        }
        return result;

    }

    private void calK(int[] nums, int k, int start, boolean[] used, Stack<Integer> s, List<List<Integer>> result) {
        if (k == s.size()) {
            List temp = new ArrayList(s);
            result.add(temp);
        } else {
            for (int i = start; i < nums.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    s.push(nums[i]);
                    calK(nums, k, i + 1, used, s, result);
                    used[i] = false;
                    s.pop();
                }
            }
        }

    }
}
