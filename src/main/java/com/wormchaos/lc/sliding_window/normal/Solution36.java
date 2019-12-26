package com.wormchaos.lc.sliding_window.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2019-12-26.
 * 判断数独
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set;
        // 数独思路
        // 判断每个横竖行不存在重复
        for (int i = 0; i < board.length; i++) {
            set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            set = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }
//        // 判断两个斜行不存在重复
//        set = new HashSet<>();
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][i] == '.') {
//                continue;
//            }
//            if (set.contains(board[i][i])) {
//                return false;
//            } else {
//                set.add(board[i][i]);
//            }
//        }
//        set = new HashSet<>();
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][8-i] == '.') {
//                continue;
//            }
//            if (set.contains(board[i][8-i])) {
//                return false;
//            } else {
//                set.add(board[i][8-i]);
//            }
//        }

        // 判断每个1/9小格子不存在重复
        for (int k1 = 0; k1 < 9; k1 += 3) {
            for (int k2 = 0; k2 < 9; k2 += 3) {
                set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i + k1][j + k2] == '.') {
                            continue;
                        }
                        if (set.contains(board[i + k1][j + k2])) {
                            return false;
                        } else {
                            set.add(board[i + k1][j + k2]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
