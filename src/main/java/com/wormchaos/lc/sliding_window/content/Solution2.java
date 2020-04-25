package com.wormchaos.lc.sliding_window.content;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Raytine on 2020/4/18.
 */
public class Solution2 {


    public int numWays(int n, int[][] relation, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        for (int i = 0; i < k; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int p = queue.poll();
                for (int l = 0; l < relation.length; l++) {
                    if (relation[l][0] == p) {
                        queue.add(relation[l][1]);
                    }
                }
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            if (queue.poll() == n - 1) {
                count++;
            }
        }

        return count;
    }
}
//    private int count = 0;
//
//    public int numWays(int n, int[][] relation, int k) {
//        if(0 == relation.length) {
//            return 0;
//        }
//        for (int i =0; i<relation.length; i++) {
//            // 起点
//            if (relation[i][0] == 0) {
//                boolean[] marked = new boolean[relation.length];
//                marked[i] = true;
//                dfs(relation, i, marked, k-1, n);
//                marked[i] = false;
//            }
//        }
//        return count;
//
//    }
//
//    private void dfs(int[][] relation, int p, boolean[] marked, int round, int n) {
//        if (round == 0) {
//            if(relation[p][1] == n-1 )
//            count++;
//        } else {
//            for (int i = 0; i < relation.length; i++) {
//                if (!marked[i] && relation[i][0] == relation[p][1]) {
//                    marked[i] = true;
//                    dfs(relation, i, marked, round - 1, n);
//                    marked[i] = false;
//                }
//            }
//
//        }
//    }
//    }
