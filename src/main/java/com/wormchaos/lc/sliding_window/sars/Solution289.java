package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-4-2.
 */
public class Solution289 {
    /**
     * 记录每个点的矩形内1的总和
     *
     * @param board
     */
    public void gameOfLife(int[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        // (0,0)到(x,y)矩形区域内1的数量
        int[][] dp = new int[board.length + 2][board[0].length + 2];
        // 计算矩形面积
        for (int i = 1; i <= board.length + 1; i++) {
            for (int j = 1; j <= board[0].length + 1; j++) {
                if(i == board.length + 1) {
                    dp[i][j] = dp[i-1][j];
                } else if (j == board[0].length + 1) {
                    dp[i][j] = dp[i][j-1];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + board[i - 1][j - 1];
                }
            }
        }
        // 依次计算每个点的值, 边长2
        int len = 1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int t = dp[i + 1 + len][j + 1 + len] - (j < len ? 0 : dp[i + 1 + len][j- len]) -  (i < len ? 0 : dp[i - len][j + 1 + len]) + (i <len || j < len ? 0 : dp[i- len][j - len]);
                if (board[i][j] == 0) {
                    if (t == 3) {
                        board[i][j] = 1;
                    }
                } else {
                    if (t -1 < 2 || t -1 > 3) {
                        board[i][j] = 0;
                    }
                }
            }
        }
    }
}
