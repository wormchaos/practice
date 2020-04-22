package com.wormchaos.lc.sliding_window.mensetsu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Created by wormchaos on 2020-4-22.
 */
public class Solution17_18 {

    public int[] shortestSeq(int[] big, int[] small) {
        int[] point = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < small.length; i++) {
            map.put(small[i], 0);
        }
        int l = -1;
        int r = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while (r < big.length) {
            l++;
            while (r < big.length) {
                // 右指针移动，直到找全所有元素
                if (map.containsKey(big[r])) {
                    map.put(big[r], map.get(big[r]) + 1);
                    if (map.get(big[r]) == 1) {
                        count++;
                        if (count == small.length) {
                            r++;
                            break;
                        }
                    }
                }
                r++;
            }
            if (count < small.length) {
                break;
            }
            while (l < big.length - 1) {
                if (map.containsKey(big[l])) {
                    map.put(big[l], map.get(big[l]) - 1);
                    if (map.get(big[l]) == 0) {
                        count--;
                        break;
                    }
                }
                l++;
            }
            if (min > r - l) {
                point[0] = l;
                point[1] = r - 1;
                min = r - l;
            }
        }


        if (point[0] == point[1] && point[0] == 0) {
            return new int[0];
        }
        return point;
    }


    private int minVal = Integer.MAX_VALUE;

    /**
     * dfs性能低
     *
     * @param big
     * @param small
     * @return
     */
    public int[] shortestSeq_dfs(int[] big, int[] small) {
        int[] point = new int[2];
        if (small.length > big.length || big.length == 0 || small.length == 0) {
            return new int[0];
        }
        // 初始化检索表
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] t = new ArrayList[small.length];
        for (int i = 0; i < small.length; i++) {
            map.put(small[i], i);
            t[i] = new ArrayList<>();
        }
        int min = 0;
        for (int i = 0; i < big.length; i++) {
            if (map.containsKey(big[i])) {
                t[map.get(big[i])].add(i);
            }
        }
        // 找到最靠近的数
        dfs(t, point, 0, Integer.MAX_VALUE, 0);
        if (point[0] == point[1] && point[0] == 0) {
            return new int[0];
        }
        return point;

    }

    private void dfs(List<Integer>[] t, int[] point, int current, int min, int max) {
        if (current == t.length) {
            if (max - min + 1 < minVal) {
                point[0] = min;
                point[1] = max;
                minVal = max - min + 1;
            }
        } else {
            for (int i = 0; i < t[current].size(); i++) {
                int val = t[current].get(i);
                dfs(t, point, current + 1, min < val ? min : val, max > val ? max : val);
            }

        }

    }
}
