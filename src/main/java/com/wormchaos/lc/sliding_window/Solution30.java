package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2019-12-25.
 * 寻找子串
 */
public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(words.length == 0) {
            return result;
        }
        int len = 0;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> count;
        for (int i =0; i < words.length; i++) {
            len += words[i].length();
            if(null == map.get(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        if(s.length() < len) {
            return result;
        }
        for (int i=0; i < s.length() - len + 1; i++) {
            count = new HashMap<>();
            String ts = s.substring(i, i+len);
            for(int k=0; k < words.length; k++) {
                boolean f = false;
                for (int j=0; j < words.length; j++) {
                    // 遍历找到能匹配的
                    if (ts.indexOf(words[j]) == 0) {
                        if (count.get(words[j]) == null || count.get(words[j]) < map.get(words[j])) {
                            count.put(words[j], null == count.get(words[j]) ? 1 : count.get(words[j]) + 1);
                            ts = ts.substring(words[j].length(), ts.length());
                            f = true;
                        }
                        break;
                    }
                }
                if(!f) {
                    break;
                }
            }
            if (ts.length() == 0) {
                result.add(i);
            }
        }

        return result;

    }
}
