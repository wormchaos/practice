package com.wormchaos.lc.sliding_window.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-2.
 * NQueen
 */
public class Solution51 {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        // 当前点是否有Q
        boolean[][] q = new boolean[n][n];
        // 是否可以放置
        int[][] f = new int[n][n];
        queryQueen(q, f, 0, n, result);
        return result;
    }

    private void queryQueen(boolean[][] q, int[][] f, int row, int n, List<List<String>> result) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    if (q[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                temp.add(sb.toString());
            }
            result.add(temp);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (f[row][i] == 0) {
                addToPos(q, f, row, i);
                queryQueen(q, f, row + 1, n, result);
                removeToPos(q, f, row, i);
            }
        }

    }

    private void addToPos(boolean[][] q, int[][] f, int row, int column) {
        q[row][column] = true;
        for (int i = 0; i < f.length; i++) {
            f[i][column] += 1;
            f[row][i] += 1;
            if (row + column - i >= 0 && row + column - i <= f.length - 1) {
                f[i][row + column - i] += 1;
            }
            if (i - row + column >= 0 && i - row + column <= f.length - 1) {
                f[i][i - row + column] += 1;
            }
        }
    }

    private void removeToPos(boolean[][] q, int[][] f, int row, int column) {
        q[row][column] = false;
        for (int i = 0; i < f.length; i++) {
            f[i][column] -= 1;
            f[row][i] -= 1;
            if (row + column - i >= 0 && row + column - i <= f.length - 1) {
                f[i][row + column - i] -= 1;
            }
            if (i - row + column >= 0 && i - row + column <= f.length - 1) {
                f[i][i - row + column] -= 1;
            }
        }
    }

//    private void queryQueen(boolean[][] q, int[][] f, int x, int y, int k, List<List<String>> result) {
//        int n = q.length;
//        if (x == n - 1 && y == n - 1) {
//            if (k == 0) {
//                List<String> temp = new ArrayList<>();
//                for (int i = 0; i < n; i++) {
//                    StringBuffer sb = new StringBuffer();
//                    for (int j = 0; j < n; j++) {
//                        if (q[i][j]) {
//                            sb.append("Q");
//                        } else {
//                            sb.append(".");
//                        }
//                    }
//                    temp.add(sb.toString());
//                }
//                result.add(temp);
//            }
//            return;
//        }
//        if (x == n) {
//            x = 0;
//            y++;
//        }
//
//        if (x < n && y < n) {
//            if (canAdd(f, x, y)) {
//                q[x][y] = true;
//                for (int i = 0; i < n; i++) {
//                    f[x][i] += 1;
//                    f[i][y] += 1;
//
//                    if (x + i < n && y + i < n) {
//                        f[x + i][y + i] += 1;
//                    }
//                    if (x + i < n && y - i >= 0) {
//                        f[x + i][y - i] += 1;
//                    }
//                    if (x - i >= 0 && y + i < n) {
//                        f[x - i][y + i] += 1;
//                    }
//                    if (x - i >= 0 && y - i >= 0) {
//                        f[x - i][y - i] += 1;
//                    }
//                }
////            System.out.println(x + "_" + y + "_" + n);
//                queryQueen(q, f, x + 1, y, k - 1, result);
//                q[x][y] = false;
//                for (int i = 0; i < n; i++) {
//                    f[x][i] -= 1;
//                    f[i][y] -= 1;
//                    if (x + i < n && y + i < n) {
//                        f[x + i][y + i] -= 1;
//                    }
//                    if (x + i < n && y - i >= 0) {
//                        f[x + i][y - i] -= 1;
//                    }
//                    if (x - i >= 0 && y + i < n) {
//                        f[x - i][y + i] -= 1;
//                    }
//                    if (x - i >= 0 && y - i >= 0) {
//                        f[x - i][y - i] -= 1;
//                    }
//                }
//            } else {
//                queryQueen(q, f, x + 1, y, k, result);
//            }
//        }
//
//    }
//
//    private boolean canAdd(int[][] f, int x, int y) {
//        return f[x][y] == 0;
//    }

}
