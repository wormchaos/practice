package com.wormchaos.lc.sliding_window.normal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2020-3-24.
 */
public class Solution1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> v = map.getOrDefault(groupSizes[i], new LinkedList<Integer>());
            v.add(i);
            map.put(groupSizes[i], v);
            if (v.size() >= groupSizes[i]) {
                list.add(v);
                map.remove(groupSizes[i]);
            }
        }
        return list;
    }
}
