package com.wormchaos.lc.sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        Map<Integer, Integer> needs = new HashMap<>();
        Map<Integer, Integer> used = new HashMap<>();
        int needSize = 0;
        for (int i =0; i<t.length(); i++) {
            int temp = (int) t.charAt(i);
            if (needs.containsKey(temp)) {
                needs.put(temp, needs.get(temp) + 1);
            } else {
                needs.put(temp, 1);
                needSize++;
            }
            used.put(temp, 0);
        }

        int left = 0;
        int len = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int right;
        // 获取首个子串
        for (right=0; right<s.length();right++) {
            len++;
            // 判断是否left++
            int now = (int) s.charAt(right);
            if(needs.containsKey(now)) {
                used.put(now, used.get(now) + 1);
                if(used.get(now).intValue() == needs.get(now).intValue()) {
                    count++;
                }
            }

            while(count == needSize) {
                // left
                if(min > len) {
                    min = len;
                    sub = s.substring(left, right + 1);
                }

                int l = (int) s.charAt(left);
                if (needs.containsKey(l)) {
                    used.put(l, used.get(l) - 1);
                    if(used.get(l).intValue() < needs.get(l).intValue()) {
                        count--;
                    }
                }
                left++;
                len--;

            }


        }
//
//        for (Map.Entry<Integer, Integer> entry : needs.entrySet()) {
//            System.out.println(entry.getKey() + "_" + (used.get(entry.getKey()) - entry.getValue()));
//        }

        return sub;
    }

    /**
     * 效率较低
     * @param s
     * @param t
     * @return
     */
    public String minWindowV1(String s, String t) {
        if(null == s || s.length() == 0) {
            return "";
        }
        if(null == t || t.length() == 0) {
            return s;
        }
        String sub = "";

        // 初始化比较子串
        int[] compArray = new int[t.length()];
        for (int i=0; i < compArray.length; i++) {
            compArray[i] = (int) t.charAt(i);
        }

        int left = 0;
        int min = Integer.MAX_VALUE;
        int len = 0;
        for (int i=0; i < s.length(); i++) {
            len++;
            while(isAcontainsB(s.substring(left, i+1), compArray)) {
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
     * @param a
     * @return
     */
    private boolean isAcontainsB(String s, int[] a) {
        Set<Integer> nums = new HashSet<>();
        for (int j=0; j<a.length; j++) {
            boolean flag = false;
            int t = a[j];
            for (int i=0; i < s.length(); i++) {
                if(nums.contains(i)) {
                    continue;
                }
                if(t == (int) s.charAt(i)) {
                    flag = true;
                    nums.add(i);
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
