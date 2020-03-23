package com.wormchaos.lc.sliding_window.sars;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-19.
 */
public class Solution407 {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        int[] cp = new int[128];
        for (char c : s.toCharArray()) {
            cnt[c]++;
            cp[c] ^= c;
        }
        int sum = 0;
        boolean hasSingle = false;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                sum += cp[i] == 0 ? cnt[i] : cnt[i] - 1;
                if (!hasSingle && cp[i] > 0) {
                    hasSingle = true;
                    sum++;
                }
            }
        }

        return sum;
    }

    /**
     * hash
     *
     * @param s
     * @return
     */
    public int longestPalindromeVMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean hasSigle = false;
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!hasSigle && entry.getValue() % 2 == 1) {
                hasSigle = true;
                sum++;
            }
            sum += entry.getValue() % 2 == 0 ? entry.getValue() : entry.getValue() - 1;
        }
        return sum;
    }
}
