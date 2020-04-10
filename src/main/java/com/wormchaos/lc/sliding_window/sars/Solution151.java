package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-4-10.
 */
public class Solution151 {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                int start = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                sb.append(s.substring(i+1, start+1)).append(" ");

            }
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1).toString();
        } else {
            return "";
        }
    }
}
