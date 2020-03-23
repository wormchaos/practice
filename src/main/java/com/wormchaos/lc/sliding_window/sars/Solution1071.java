package com.wormchaos.lc.sliding_window.sars;

/**
 * Created by wormchaos on 2020-3-12.
 */
public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals("") || str2.equals("")) {
            return "";
        }
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        while(str1.length() > 0 ) {
            if(str1.length() < str2.length()) {
                String temp = str1;
                str1 = str2;
                str2 = temp;
            }

            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return "";
                }
            }
            str1 = str1.substring(str2.length(), str1.length());
        }

        return str2;
    }
}
