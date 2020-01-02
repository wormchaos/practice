package com.wormchaos.lc.sliding_window.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2019-12-26.
 */
public class Solution37 {

    /**
     * 剪枝法
     * @param board
     */
    public void solveSudoku(char[][] board) {

    }
//    int n = 9;
//    private Set<Character>[] rowSet = new HashSet[9];
//    private Set<Character>[] columnSet = new HashSet[9];
//    private Set<Character>[] boxSet = new HashSet[9];
//
//    boolean solved = false;
//
//    public void solveSudoku(char[][] board) {
//        for (int i = 0; i < n; i++) {
//            Set<Character> row = new HashSet<>();
//            Set<Character> column = new HashSet<>();
//            Set<Character> box = new HashSet<>();
//            rowSet[i] = row;
//            columnSet[i] = column;
//            boxSet[i] = box;
//        }
//        // 初始化可插入队列
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if (board[i][j] == '.') {
//                    continue;
//                }
//                rowSet[i].add(board[i][j]);
//                columnSet[j].add(board[i][j]);
//                boxSet[(i / 3) * 3 + j / 3].add(board[i][j]);
//            }
//        }
//        // 回溯查找
//        draw(board, 0, 0);
//    }
//
//    private void draw(char[][] board, int x, int y) {
//        if (x == n) {
//            x = 0;
//            y++;
//        }
//        if(y == n) {
//            // 跳出循环
//            solved = true;
//        }
//        if (y < n) {
//            if (board[x][y] != '.') {
//                draw(board, x + 1, y);
//            } else {
//                for (char num = '1'; num <= '9'; num++) {
//                    if (!rowSet[x].contains(num) && !columnSet[y].contains(num)
//                            && !boxSet[(x / 3) * 3 + y / 3].contains(num)) {
//                        rowSet[x].add(num);
//                        columnSet[y].add(num);
//                        boxSet[(x / 3) * 3 + y / 3].add(num);
//                        board[x][y] = num;
//                        draw(board, x + 1, y);
//                        if(!solved) {
//                            rowSet[x].remove(num);
//                            columnSet[y].remove(num);
//                            boxSet[(x / 3) * 3 + y / 3].remove(num);
//                            board[x][y] = '.';
//                        }
//                    }
//                }
//            }
//        }
//    }

}
