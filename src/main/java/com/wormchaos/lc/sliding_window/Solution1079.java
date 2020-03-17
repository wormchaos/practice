package com.wormchaos.lc.sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2020-3-17.
 */
public class Solution1079 {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        String s = "";
        char[] chars = tiles.toCharArray();
        boolean[] used = new boolean[chars.length];
        dfs(chars, used, s, set);
        return set.size() - 1;
    }

    private void dfs(char[] chars, boolean[] used, String s, Set<String> set) {
        if(!set.contains(s)) {
            set.add(s);
        }
        for (int i =0; i < chars.length; i++) {
            if (!used[i]) {
                used[i] = true;
                dfs(chars, used, s + chars[i], set);
                used[i] = false;
            }
        }
    }
}
