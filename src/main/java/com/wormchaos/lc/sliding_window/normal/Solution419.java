package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-3-25.
 */
public class Solution419 {
    /**
     * 不用额外空间
     *
     * @param board
     * @return
     */
    public int countBattleships(char[][] board) {
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    if (i-1 >=0 && board[i-1][j] == 'X') {
                        sum--;
                    } else if (j-1 >=0 && board[i][j-1] == 'X') {
                        sum--;
                    }
                    sum++;
                }
            }
        }
        return sum;
    }

    /**
     * 求1*N格子
     *
     * @param board
     * @return
     */
    public int countBattleships_MARKED(char[][] board) {
        int sum = 0;
        boolean[][] marked = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (marked[i][j]) {
                    continue;
                }
                if (board[i][j] == 'X') {
                    sum++;
                    // 横向
                    if (i + 1 < board.length && board[i + 1][j] == 'X') {
                        int k = i + 1;
                        while (k < board.length && board[k][j] == 'X') {
                            marked[k][j] = true;
                            k++;
                        }
                    } else if (j + 1 < board[i].length && board[i][j + 1] == 'X') {
                        while (j + 1 < board[i].length && board[i][j + 1] == 'X') {
                            j++;
                        }
                    }
                }
            }
        }
        return sum;
    }
}
