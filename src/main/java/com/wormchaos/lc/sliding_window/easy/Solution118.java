package com.wormchaos.lc.sliding_window.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-1-6.
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<Integer>[] a = new ArrayList[numRows];
        List<List<Integer>> resut = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j=0; j <= i;j++) {
                if(j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(last.get(j-1) + last.get(j));
                }
            }
            resut.add(temp);
            last = temp;
        }
        return resut;
    }
}
