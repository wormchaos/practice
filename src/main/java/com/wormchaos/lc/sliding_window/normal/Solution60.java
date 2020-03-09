package com.wormchaos.lc.sliding_window.normal;

import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-19.
 */
public class Solution60 {

    /**
     * 数学法
     *
     * @param n
     * @param k
     * @return
     */
    public String getPermutation(int n, int k) {
        // n个数共有n!总数
        int[] dp = new int[10];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] * i;
        }
        // 是否已经使用j <= index && !used[index]
        boolean[] used = new boolean[n];
        // 把第几个数改成0为起始的坐标
        StringBuffer sb = new StringBuffer();
        for (int i = n - 1; i >= 0; i--) {
            // 第k个数在这里的下标index
            int index = (k - 1) / dp[i];
            int j = 0;
            while (j < index) {
                if(j > n-1) {
                    index = 0;
                    break;
                }
                if(used[j]) {
                    index++;
                }
                j++;
            }
            while(used[index]) {
                index++;
            }
            if(index == n-1 && used[n-1]) {
                index = 0;
            }
            used[index] = true;
            sb.append(index + 1);
            k -= (k - 1) / dp[i] * dp[i];
        }
        return sb.toString();

    }


    int count = 0;
    boolean finished = false;

    /**
     * 回溯 性能极低
     *
     * @param n
     * @param k
     * @return
     */
    public String getPermutation_DFS(int n, int k) {
        Stack<Integer> stack = new Stack();
        loop(stack, n, k, new boolean[n + 1]);
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }

    private void loop(Stack<Integer> stack, int n, int result, boolean[] marked) {
        if (stack.size() == n) {
            count++;
            if (count == result) {
                finished = true;
            }
        } else if (stack.size() < n) {
            for (int i = 1; i <= n; i++) {
                if (!finished && !marked[i]) {
                    marked[i] = true;
                    stack.push(i);
                    loop(stack, n, result, marked);
                    if (!finished) {
                        stack.pop();
                        marked[i] = false;
                    }
                }
            }
        }
    }
}
