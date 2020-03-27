package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2020-3-27.
 */
public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        if(n == 0) {
            return list;
        }
        list.add(1);
        int level = 0;
        while (level + 1< n) {
            int size = list.size();
            for (int i = size-1; i >=0; i--) {
                list.add(list.get(i) + (2 << level));
            }
            level++;
        }
        return list;
    }
}
