package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2019-12-20.
 * 多叉树 ?
 */
public class Solution17 {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<Integer, List<String>> map = new HashMap<>();
        add(map, '2', "abc");
        add(map, '3', "def");
        add(map, '4', "ghi");
        add(map, '5', "jkl");
        add(map, '6', "mno");
        add(map, '7', "pqrs");
        add(map, '8', "tuv");
        add(map, '9', "wxyz");
        return ping(map, digits, digits.length() - 1);
    }

    private List<String> ping(Map<Integer, List<String>> map, String s, int k) {
        int c = (int) s.charAt(k);
        List<String> r = map.get(c);
        if (k == 0) {
            return r;
        }
        List<String> rl = ping(map, s, k - 1);
        List<String> result = new ArrayList<>();
        for (String l : rl) {
            for (String t : r) {
                result.add(l + t);
            }
        }
        return result;
    }

    private void add(Map<Integer, List<String>> map, int num, String result) {
        List<String> l = new ArrayList<>();
        for (char c : result.toCharArray()) {
            l.add(String.valueOf(c));
        }
        map.put(num, l);
    }
}
