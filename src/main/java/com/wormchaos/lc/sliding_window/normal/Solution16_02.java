package com.wormchaos.lc.sliding_window.normal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-17.
 */
public class Solution16_02 {

    public class WordsFrequency {
        private Map<String, Integer> map;

        public WordsFrequency(String[] book) {
            map = new HashMap<>();
            for (String s : book) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

        }

        public int get(String word) {
            return map.getOrDefault(word, 0);
        }
    }
}
