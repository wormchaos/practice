package com.wormchaos.lc.sliding_window.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wormchaos on 2020-1-11.
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = t.charAt(i) - s.charAt(i);
        }
        num += t.charAt(t.length() - 1);
        return (char)num;
    }

    /**
     * map解
     * 
     * @param s
     * @param t
     * @return
     */
    public char findTheDifferenceV1(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (null == map.get(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (null == map.get(t.charAt(i)) || map.get(t.charAt(i)) == 0) {
                return t.charAt(i);
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }
        return t.charAt(0);
    }
}
