package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-17.
 * 单词搜索
 */
public class Solution79 {

    boolean finish = false;

    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board[0].length == 0) {
            return word.length() == 0;
        }
        if(word.length() == 0) {
            return true;
        }
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    used[i][j] = true;
                    loop(word, 1, i, j, board, used);
                    used[i][j] = false;
                    if (finish) {
                        return finish;
                    }
                }
            }
        }
        return finish;
    }

    private void loop(String word, int current, int x, int y, char[][] board, boolean[][] used) {
        if (current == word.length()) {
            finish = true;
        } else {
            if(!finish){
                if (x > 0 && !used[x - 1][y] && board[x - 1][y] == word.charAt(current)) {
                    used[x - 1][y] = true;
                    loop(word, current + 1, x - 1, y, board, used);
                    used[x - 1][y] = false;
                }
                if (y > 0 && !used[x][y - 1] && board[x][y - 1] == word.charAt(current)) {
                    used[x][y - 1] = true;
                    loop(word, current + 1, x, y - 1, board, used);
                    used[x][y - 1] = false;
                }
                if (x < board.length - 1 && !used[x + 1][y] && board[x + 1][y] == word.charAt(current)) {
                    used[x + 1][y] = true;
                    loop(word, current + 1, x + 1, y, board, used);
                    used[x + 1][y] = false;
                }
                if (y < board[0].length - 1 && !used[x][y + 1] && board[x][y + 1] == word.charAt(current)) {
                    used[x][y + 1] = true;
                    loop(word, current + 1, x, y + 1, board, used);
                    used[x][y + 1] = false;
                }
            }

        }

    }
}
