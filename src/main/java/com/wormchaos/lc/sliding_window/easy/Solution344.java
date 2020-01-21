package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-1-21.
 */
public class Solution344 {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
    }
}
