package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-10.
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        boolean[][] add = new boolean[matrix.length][matrix[0].length];
        add[0][0] = true;
        int count = 1;
        int x = 0;
        int y = 0;
        int ax = 0;
        int ay = 1;
        int addIndex = 1;
        while (count < matrix.length * matrix[0].length) {
            if (x + ax > matrix.length - 1 || y + ay > matrix[0].length - 1
                    || y + ay < 0 || x + ax < 0 || add[x + ax][y + ay]) {
                ax += addIndex;
                ay += addIndex;
                addIndex = -addIndex;
            }
            add[x = x + ax][y = y + ay] = true;
            result.add(matrix[x][y]);
            count++;
        }
        return result;
    }
}
