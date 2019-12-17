package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-17.
 * 回文数
 */
public class Solution5 {

    public String longestPalindrome(String s) {
        if(s.length() == 0) {
            return "";
        }
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) s.charAt(i);
        }
        int max = 0;
        String result = "";
        Boolean[][] c = new Boolean[a.length][a.length];
        isLoop(a, 0, a.length -1, c);
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= i; j--) {
                if (isLoop(a, i, j, c)) {
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }

    private boolean isLoop(int[] a, int i, int j, Boolean[][] c) {
        if(null != c[i][j]) {
            return c[i][j];
        }
        if(i == j){
            c[i][j] = true;
            return c[i][j];
        }
        if(i + 1 == j) {
            c[i][j] = a[i] == a[j];
            return c[i][j];
        }
        c[i][j] = isLoop(a, i + 1, j - 1, c);
        c[i][j] = a[i] == a[j] && c[i][j];
        return c[i][j];

    }
}
