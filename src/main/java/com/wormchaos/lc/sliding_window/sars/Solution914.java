package com.wormchaos.lc.sliding_window.sars;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-27.
 */
public class Solution914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int d : deck) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }
        int min = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(min < 0) {
                min = entry.getValue();
            }
            min = gcd(min, entry.getValue());
        }
        if (min < 2) {
            return false;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % min != 0) {
                return false;
            }
        }

        return true;
    }

    // 获取最大公约数
    private int gcd(int a, int b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        if(b == 0) {
            return a;
        }
        return gcd(b, a - (a / b) * b);
    }
}
