package com.wormchaos.lc.sliding_window.mensetsu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-23.
 */
public class Solution08_07 {

//    public String[] permutation(String S) {
//        char[] c = S.toCharArray();
//        boolean[] marked = new boolean[S.length()];
//        // i表示不确定的数量
//        List<String> result = get(c, marked, S.length());
//        String[] f = new String[result.size()];
//        for (int i =0; i <result.size();i++) {
//            f[i] = result.get(i);
//        }
//        return f;
//    }
//
//    private List<String> get(char[] c, boolean[] marked, int n) {
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < c.length; i++) {
//            if (!marked[i]) {
//                if(n == 1) {
//                    result.add(String.valueOf(c[i]));
//                } else {
//                    marked[i] = true;
//                    List<String> temp = get(c, marked, n - 1);
//                    for (int j = 0; j < temp.size(); j++) {
//                        result.add(c[i] + temp.get(j));
//                    }
//                    marked[i] = false;
//                }
//            }
//        }
//        return result;
//    }

    /**
     * list替代queue的交换法
     *
     * @param S
     * @return
     */
    public String[] permutation_SWITCHV2(String S) {
        List<String> list = new ArrayList<>();
        list.add(S);
        for (int i = 0; i < S.length() - 1; i++) {
            int size = list.size();
            for (int j = i + 1; j < S.length(); j++) {
                for (int index = 0; index < size; index++) {
                    list.add(swapV2(list.get(index), i, j));
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    //交换位置
    private String swapV2(String s, int pos1, int pos2) {
        char[] chars = s.toCharArray();
        chars[pos1] ^= chars[pos2];
        chars[pos2] ^= chars[pos1];
        chars[pos1] ^= chars[pos2];
        return new String(chars);
    }


    /**
     * 交换法
     *
     * @param S
     * @return
     */
    public String[] permutation_switch(String S) {
        char[] c = S.toCharArray();
        List<String> queue = new LinkedList<>();
        queue.add(S);
        for (int p = 0; p < S.length() - 1; p++) {
            int size = queue.size();
            for (int a = 0; a < size; a++) {
                String now = queue.get(a);
                for (int i = p+1; i < c.length; i++) {
                    queue.add(swap(now, p, i));
                }
            }
        }

        return queue.toArray(new String[queue.size()]);
    }

    private String swap(String s, int i, int j) {
        char[] c = s.toCharArray();
        c[i] ^= c[j];
        c[j] ^= c[i];
        c[i] ^= c[j];
        return new String(c);
    }

    /**
     * 回溯
     *
     * @param S
     * @return
     */
    public String[] permutation_dfs(String S) {
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
            for (int i = 0; i < n; i++) {
                sb.append(stack.get(i));
            }
            result.add(sb.toString());
        } else {
            for (int i = 0; i < c.length; i++) {
                if (!marked[i]) {
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
