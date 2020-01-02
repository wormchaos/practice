package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-1-2.
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] c = new boolean[candidates.length];
        List<List<Integer>> result = new ArrayList<>();
        if (candidates.length == 0) {
            return result;
        }
        sum(candidates, target, 0, c, result);
        return result;
    }

    private void sum(int[] candidates, int target, int next, boolean[] c, List<List<Integer>> result) {
        if (target == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < c.length; i++) {
                if (c[i]) {
                    temp.add(candidates[i]);
                }
            }
            result.add(temp);
            return;
        }
        if (target > 0) {
            for (int i = next; i < candidates.length; i++) {
                if (!c[i]) {
                    // 检查数是否一致，如果一致且前一个还没用过
                    if (next > 0 && next < candidates.length && candidates[next] == candidates[next - 1] && !c[i-1]) {
                        continue;
                    }
                    c[i] = true;
                    sum(candidates, target - candidates[i], i + 1, c, result);
                    c[i] = false;
                }
            }
        }
    }
}
