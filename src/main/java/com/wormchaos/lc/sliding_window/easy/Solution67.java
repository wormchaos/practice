package com.wormchaos.lc.sliding_window.easy;

/**
 * Created by wormchaos on 2020-3-6.
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        // 保证a比b短
        if (b.length() < a.length()) {
            String t = a;
            a = b;
            b = t;
        }
        int add = 0;
        String s = "";
        int i = 0;
        for (; i < a.length(); i++) {
            char c1 = a.charAt(a.length() - i - 1);
            char c2 = b.charAt(b.length() - i - 1);
            int c = (c1 - '0') + (c2 - '0') + add;
            add = c / 2;
            s = (c % 2) + s;
        }
        for (; i <b.length(); i++) {
            char c2 = b.charAt(b.length() - i - 1);
            int c =  (c2 - '0') + add;
            add = c / 2;
            s = (c % 2) + s;
        }
        if(add > 0 ){
            s = 1 + s;
        }
        return s;
    }
}
