package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-16.
 */
public class Solution01_06 {
    public String compressString(String S) {
        if(S.length() == 0) {
            return "";
        }
        char last = S.charAt(0);
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if (last == S.charAt(i)) {
                count++;
            } else {
                sb.append(last).append(count);
                last = S.charAt(i);
                count = 1;
            }
        }
        if(count > 0) {
            sb.append(last).append(count);
        }
        return sb.length() < S.length() ? sb.toString() : S;
    }
}
