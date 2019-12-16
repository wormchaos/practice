package com.wormchaos.lc.sliding_window;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wormchaos on 2019-12-16.
 * 最小覆盖子串
 */
public class Solution76 {
    public String minWindow(String s, String t) {
        if(null == s || s.length() == 0) {
            return "";
        }
        if(null == t || t.length() == 0) {
            return s;
        }
        String sub = "";

        // 初始化比较子串
        Set<Integer> compSet = new HashSet<>();
        for (int i=0; i < t.length(); i++) {
            compSet.add((int) t.charAt(i));
        }
        int left = 0;
        int min = Integer.MAX_VALUE;
        int len = 0;
        for (int i=0; i < s.length(); i++) {
            len++;
            while(isAcontainsB(s.substring(left, i+1), compSet)) {
                len--;
                if(len < min) {
                    min = len;
                    sub = s.substring(left, i+1);
                }
                left++;
            }
        }
        return sub;
    }

    /**
     * 子串是否包含元素合集
     * @param s
     * @param set
     * @return
     */
    private boolean isAcontainsB(String s, Set set) {
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            Integer t = it.next();
            boolean flag = false;
            for (int i=0; i < s.length(); i++) {
                if(t == (int) s.charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
