package com.wormchaos.lc.sliding_window.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2019-12-26.
 * 判断数独
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        Set<Character>[] row = new HashSet[n];
        Set<Character>[] column = new HashSet[n];
        Set<Character>[] box = new HashSet[n];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            column[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                // 3 *I+J
                int box_index = (i / 3 ) * 3 + j / 3;
                if(row[i].contains(board[i][j]) || column[j].contains(board[i][j]) || box[box_index].contains(board[i][j])){
                    return false;
                }
                row[i].add(board[i][j]);
                column[j].add(board[i][j]);
                box[box_index].add(board[i][j]);
            }
        }
        return true;
    }
}
