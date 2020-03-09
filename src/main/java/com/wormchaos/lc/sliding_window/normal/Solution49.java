package com.wormchaos.lc.sliding_window.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by wormchaos on 2020-1-17.
 */
public class Solution49 {

    /**
     * 散列官方优化
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    /**
     * 散列
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagramsV2(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String hash = hash(s);
            if (null == map.get(hash)) {
                map.put(hash, new ArrayList<String>());
            }
            List<String> value = map.get(hash);
            value.add(s);
            map.put(hash, value);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    private String hash(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }

    /**
     * 复杂方法，比较垃圾
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagramsV1(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<Character>[] set = new Set[strs.length];
        boolean[] used = new boolean[strs.length];
        int current = 0;
        while (current < strs.length) {
            if (used[current]) {
                current++;
                continue;
            }
            List<String> temp = new ArrayList<>();
            String s = strs[current];
            used[current] = true;
            temp.add(s);
            Map<Character, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (null == map.get(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                    count++;
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
            }
            for (int i = current + 1; i < strs.length; i++) {
                if (!used[i] && s.length() == strs[i].length()) {
                    boolean flag = true;
                    Map<Character, Integer> comp = new HashMap<>();
                    int compCount = 0;
                    for (int j = 0; j < strs[i].length(); j++) {
                        if (null == comp.get(strs[i].charAt(j))) {
                            comp.put(strs[i].charAt(j), 1);
                        } else {
                            comp.put(strs[i].charAt(j), comp.get(strs[i].charAt(j)) + 1);
                        }
                        if (null == map.get(strs[i].charAt(j)) || comp.get(strs[i].charAt(j)) > map.get(strs[i].charAt(j))) {
                            flag = false;
                            break;
                        } else {
                            if (comp.get(strs[i].charAt(j)) == map.get(strs[i].charAt(j))) {
                                compCount++;
                            }
                        }

                    }
                    if (flag && compCount == count) {
                        used[i] = flag;
                        temp.add(strs[i]);
                    }
                }
            }
            result.add(temp);
            current++;
        }

        return result;
    }
}
