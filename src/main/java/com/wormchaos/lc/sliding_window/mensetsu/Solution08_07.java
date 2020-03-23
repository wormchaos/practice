package com.wormchaos.lc.sliding_window.mensetsu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Solution08_07 {
    public String[] permutation(String S) {
        char[] c = S.toCharArray();
        boolean[] marked = new boolean[c.length];
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int n = c.length;
        dfs(c, marked, stack, n, result);
        String[] s = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            s[i] = result.get(i);
        }
        return s;
    }

    private void dfs(char[] c, boolean[] marked, Stack<Character> stack, int n, List<String> result) {
        if (stack.size() == n) {
            StringBuffer sb = new StringBuffer();
            for (int i =0; i < n; i++) {
                sb.append(stack.get(i));
            }
            result.add(sb.toString());
        } else {
            for (int i =0; i <c.length; i++) {
                if(!marked[i]) {
                    marked[i] = true;
                    stack.push(c[i]);
                    dfs(c, marked, stack, n, result);
                    stack.pop();
                    marked[i] = false;
                }
            }
        }

    }
}
