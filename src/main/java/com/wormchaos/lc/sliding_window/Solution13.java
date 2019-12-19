package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-19.
 */
public class Solution13 {

    public int romanToInt(String s) {
        int[] a = new int[]{0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] b = new String[]{"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int k =0;
        char[] c = new char[s.length()];
        for (int i=0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        int num = 0;
        for (int i = a.length - 1; i > 0; i--) {
            while (startWith(c, k, b[i])) {
                k += b[i].length();
                num += a[i];
            }
        }
        return num;
    }

    private boolean startWith(char[] c, int k, String s) {
        if(s.length() > 1) {
            if(k >= c.length -1) {
                return false;
            } else {
                char s1 = s.charAt(0);
                char s2 = s.charAt(1);
                return s1 == c[k] && s2 == c[k+1];
            }
        } else {
            if(k > c.length - 1) {
                return false;
            }
            return c[k] == s.charAt(0);
        }
    }
}
