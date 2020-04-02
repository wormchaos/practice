package com.wormchaos.lc.sliding_window.normal;

import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-3-26.
 */
public class Solution1104 {
    public List<Integer> pathInZigZagTree(int label) {
//        int t = label - 1;
//        int n = 0;
//        while (t > 0) {
//            label /= 2;
//            n++;
//        }
        int n = 1;
        int level = 0;
        while (n < label) {
            n *= 2;
            level++;
        }
        int index = label - 1;
        Stack<Integer> stack = new Stack();
        while (index > 0) {
            stack.push(index);
            index = getParent(index);
        }
//        if (stack.)
        return null;
    }

    private int getParent(int label) {
        return (label - 1) / 2;
    }
}
