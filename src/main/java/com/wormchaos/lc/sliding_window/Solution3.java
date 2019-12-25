package com.wormchaos.lc.sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2019-12-16.
 */
public class Solution3 {

    public static void main(String... args) {
        // String s = "wobgrovw";
        String s = "abcab";
        System.out.print(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 1;
        Set<Integer> set = new HashSet<>();
        int len = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            len++;
            int is = (int) s.charAt(i);
            while (set.contains(is)) {
                set.remove((int) s.charAt(left));
                len--;
                left++;
            }
            if (len > max) {
                max = len;
            }
            set.add(is);
        }

        return max;
    }

    private static int lengthOfLongestSubstringV2(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 1;
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int len = 1;
        set.add((int) s.charAt(0));
        // 当前头i, 长度len，尾坐标i+len - 1
        while (i + len < s.length()) {
            int newChar = (int) s.charAt(i + len);
            if (set.contains(newChar)) {
                for (int k = i; k < i + len; k++) {
                    if ((int) s.charAt(k) == newChar) {
                        if (k == i + len - 1) {
                            i = i + len;
                            len = 1;
                            set = new HashSet<>();
                            set.add(newChar);
                        } else {
                            set = new HashSet<>();
                            for (int i1 = k; i1 < i + len; i1++) {
                                set.add((int) s.charAt(i1));
                            }
                            len = i + len - k;
                            i = k + 1;
                        }
                        break;
                    }
                }
            } else {
                len++;
                set.add(newChar);
                if (len > max) {
                    max = len;
                }
            }
        }

        return max;
    }

    private static int lengthOfLongestSubstringV1(String s) {
        int max = 0;
        Set<Integer> set;
        for (; max < s.length(); max++) {
            int tMax = max;
            for (int i = 0; i < s.length(); i++) {
                set = new HashSet<>();
                for (int j = i; j < i + max + 1; j++) {
                    if (j >= s.length()) {
                        break;
                    }
                    int t = (int) s.charAt(j);
                    if (set.contains(t)) {
                        break;
                    }
                    set.add(t);
                }
                if (set.size() > tMax) {
                    tMax = set.size();
                    break;
                }
            }
            if (tMax == max) {
                break;
            }
        }

        return max;
    }

}
