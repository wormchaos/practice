package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-19.
 * 公共前缀
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        int l = strs.length;
        if(l == 0) {
            return "";
        }
        if(l == 1) {
            return strs[0];
        }
        int[] a = new int[l];
        int minLen = Integer.MAX_VALUE;
        for (int i=0; i< l; i++) {
            if (minLen > strs[i].length()) {
                minLen = strs[i].length();
            }
        }
        int rl = 0;
        for (int i =0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < l; j++) {
                if(c != strs[j].charAt(i)) {
                    return strs[0].substring(0, rl);
                }
            }
            rl++;
        }

        return strs[0].substring(0, minLen);

    }
}
