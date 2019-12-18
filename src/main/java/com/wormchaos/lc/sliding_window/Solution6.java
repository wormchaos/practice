package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-18.
 * 字形变换
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        char[][] a = new char[s.length()][numRows];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < numRows; j++) {
                a[i][j] = 0;
            }
        }
        if(numRows == 1) {
            return s;
        }
        int x = 0;
        int y = 0;
        boolean isDown = true;
        for (int i = 0; i < s.length(); i++) {
            a[x][y] = s.charAt(i);
            if (isDown) {
                if (y == numRows - 1) {
                    y--;
                    x++;
                    isDown = false;
                } else {
                    y++;
                }
            } else {
                if (y == 0) {
                    isDown = true;
                    y++;
                } else {
                    y--;
                    x++;
                }
            }
        }
        String result = "";
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < s.length(); i++) {
                if (a[i][j] > 0) {
                    result += a[i][j];
                }
//                System.out.print(a[i][j]);
            }
//            System.out.println();
        }
        return result;

    }
}
