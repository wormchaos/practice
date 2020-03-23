package com.wormchaos.lc.sliding_window.sars;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-17.
 */
public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> cmpMap;
        int result = 0;
        for (String s : words) {
            cmpMap = new HashMap<>();
            boolean f = true;
            for (char c : s.toCharArray()) {
                cmpMap.put(c, cmpMap.getOrDefault(c, 0) + 1);
                if(cmpMap.get(c) > map.getOrDefault(c, 0)) {
                    f = false;
                    break;
                }
            }
            if(f) {
                result += s.length();
            }
        }
        return result;
    }
}
