package com.wormchaos.lc.sliding_window.normal;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 有向图
 * Created by wormchaos on 2020-3-25.
 */
public class Solution797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack();
        stack.push(0);
        dfs(graph, 0, stack, result);
        return result;
    }

    private void dfs(int[][] graph, int current, Stack<Integer> stack, List<List<Integer>> result) {
        if (graph[current].length == 0) {
            result.add(new ArrayList<>(stack));
        } else {
            int[] temp = graph[current];
            for (int t : temp) {
                stack.push(t);
                dfs(graph, t, stack, result);
                stack.pop();
            }
        }
    }
}
