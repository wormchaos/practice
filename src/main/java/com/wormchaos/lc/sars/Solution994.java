package com.wormchaos.lc.sars;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by wormchaos on 2020-3-4.
 */
public class Solution994 {
//    int[] dr = new int[]{-1, 0, 1, 0};
//    int[] dc = new int[]{0, -1, 0, 1};
//
//    public int orangesRotting(int[][] grid) {
//        int R = grid.length, C = grid[0].length;
//
//        // queue : all starting cells with rotten oranges
//        Queue<Integer> queue = new ArrayDeque();
//        Map<Integer, Integer> depth = new HashMap();
//        for (int r = 0; r < R; ++r)
//            for (int c = 0; c < C; ++c)
//                if (grid[r][c] == 2) {
//                    int code = r * C + c;
//                    queue.add(code);
//                    depth.put(code, 0);
//                }
//
//        int ans = 0;
//        while (!queue.isEmpty()) {
//            int code = queue.remove();
//            int r = code / C, c = code % C;
//            for (int k = 0; k < 4; ++k) {
//                int nr = r + dr[k];
//                int nc = c + dc[k];
//                if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
//                    grid[nr][nc] = 2;
//                    int ncode = nr * C + nc;
//                    queue.add(ncode);
//                    depth.put(ncode, depth.get(code) + 1);
//                    ans = depth.get(ncode);
//                }
//            }
//        }
//
//        for (int[] row: grid)
//            for (int v: row)
//                if (v == 1)
//                    return -1;
//        return ans;
//
//    }

    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, -1, 0, 1};

    public int orangesRotting(int[][] grid) {
        int count = 0;
        Queue<Integer> q = new LinkedList();
        boolean has = true;
        while(has) {
            has = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        q.add(i * grid[0].length + j);
                    }
                }
            }
            while(!q.isEmpty()) {
                int t = q.remove();
                int i = t / grid[0].length;
                int j = t % grid[0].length;
                for (int k = 0; k < 4; k++) {
                    int x = i + dr[k];
                    int y = j + dc[k];
                    if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        has =true;
                    }
                }
            }

            if (has) {
                count++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return count;

    }
}
