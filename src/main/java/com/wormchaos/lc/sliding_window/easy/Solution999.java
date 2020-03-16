package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-3-16.
 */
public class Solution999 {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        // R”，“.”，“B” 和 “p”
        int[] xc = new int[]{-1, 0, 1, 0};
        int[] yr = new int[]{0, -1, 0, 1};
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                if (board[x][y] == 'R') {
                    // 当前点开始
                    for (int i = 0; i < xc.length; i++) {
                        // 偏移量
                        int xt = x + xc[i];
                        int yt = y + yr[i];
                        while (xt >= 0 && yt >= 0 && xt < board.length && yt < board[0].length) {
                            if (board[xt][yt] == 'B') {
                                break;
                            } else if (board[xt][yt] == 'p') {
                                count++;
                                break;
                            }
                            xt += xc[i];
                            yt += yr[i];
                        }

                    }
                    break;
                }
            }
        }
        return count;
    }
}
