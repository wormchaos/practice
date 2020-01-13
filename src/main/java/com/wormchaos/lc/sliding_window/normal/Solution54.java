package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-10.
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) {
            return result;
        }
        boolean[][] add = new boolean[matrix.length][matrix[0].length];
        int count = 1;
        int x = 0;
        int y = 0;
        int ax = 0;
        int ay = 1;

        add[0][0] = true;
        result.add(matrix[0][0]);
        // 0123 右下左上
        int status = 0;
        while (count < matrix.length * matrix[0].length) {
            if(status == 0 && (y + ay >= matrix[0].length || add[x][y + ay])) {
                status = 1;
                ax = 1;
                ay = 0;
            } else if(status == 1 && (x + ax >= matrix.length || add[x + ax][y])) {
                status = 2;
                ax = 0;
                ay = -1;
            } else if(status == 2 && (y + ay < 0 || add[x][y + ay])) {
                status = 3;
                ax = -1;
                ay = 0;
            } else if(status == 3 && (x + ax < 0 || add[x + ax][y])) {
                status = 0;
                ax = 0;
                ay = 1;
            }
            add[x = x + ax][y = y + ay] = true;
            result.add(matrix[x][y]);
            count++;
        }
        return result;
    }
}
