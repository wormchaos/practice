package com.wormchaos.lc.sliding_window.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2019-12-26.
 */
public class Solution37 {

    private int n = 9;

    private boolean[][] point = new boolean[n][n];
    Set<Character>[] rows = new Set[n];
    Set<Character>[] columns = new Set[n];
    Set<Character>[] boxes = new Set[n];

    boolean solved = false;

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    rows[i].add(board[i][j]);
                    columns[j].add(board[i][j]);
                    boxes[i / 3 * 3 + j / 3].add(board[i][j]);
                }
            }
        }
//        findNext(board);
        calLine(board, 0, 0);
    }


    private void calLine(char[][] board, int row, int column) {
        if (column == n) {
            row++;
            column = 0;
        }
        if (row == n) {
            // 终止记录
            solved = true;
        } else {
            if (board[row][column] == '.') {
                for (char k = '1'; k <= '9'; k++) {
                    if (!rows[row].contains(k)
                            && !columns[column].contains(k)
                            && !boxes[row / 3 * 3 + column / 3].contains(k)) {
                        board[row][column] = k;
                        addPoint(row, column, k, true);
                        calLine(board, row, column + 1);
                        if (!solved) {
                            // 状态回归
                            addPoint(row, column, k, false);
                            board[row][column] = '.';
                        }
                    }
                }
            } else {
                calLine(board, row, column + 1);
            }
        }

    }

    private void addPoint(int x, int y, char value, boolean b) {
        if (b) {
            rows[x].add(value);
            columns[y].add(value);
            boxes[x / 3 * 3 + y / 3].add(value);
        } else {
            rows[x].remove(value);
            columns[y].remove(value);
            boxes[x / 3 * 3 + y / 3].remove(value);
        }

    }

}
