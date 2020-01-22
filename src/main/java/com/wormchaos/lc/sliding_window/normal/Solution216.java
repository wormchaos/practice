package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-22.
 */
public class Solution216 {

    /// 此题无法用dp是因为元素不氪重复，每个点的值可能为多个
//    public List<List<Integer>> combinationSum3(int k, int n) {
//        List<List<Integer>> result = new ArrayList<>();
//        // 最高数 1+...+9 = 45
//        if (n > 45 || n < 1) {
//            return result;
//        }
//        // 1..i之间是存在解 =k，此时用到的数字为dp(i,k)个
//        int[][] dp = new int[10][46];
//        for (int i = 1; i <= 9; i++) {
//            for (int j = i; j < 45; j++) {
//                dp[i][j] = dp[i-1][j];
//            }
//        }
//
//        return result;
//    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        // 最高数 1+...+9 = 45
        if (n > 45 || n < 1) {
            return result;
        }
        boolean[] marked = new boolean[10];
        Stack<Integer> stack = new Stack<>();
        dfs(n, marked, stack, result, 1, k);
        return result;
    }

    private void dfs(int n, boolean[] marked, Stack<Integer> stack, List<List<Integer>> result, int current, int k) {
        if (n == 0 && stack.size() == k) {
            List<Integer> temp = new ArrayList<>();
            for (Object i : stack.toArray()) {
                temp.add((Integer) i);
            }
            result.add(temp);

        } else if (n > 0) {
            for (int i = current; i <= 9; i++) {
                if (!marked[i]) {
                    marked[i] = true;
                    stack.push(i);
                    dfs(n - i, marked, stack, result, i + 1, k);
                    stack.pop();
                    marked[i] = false;
                }
            }

        }

    }
}
