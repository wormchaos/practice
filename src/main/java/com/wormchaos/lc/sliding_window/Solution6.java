package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-18.
 * 字形变换
 */
public class Solution6 {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        int q = 2 * (numRows - 1);
        char[] a = new char[(s.length() / q + 1) * q];
        for (int i= 0; i< s.length(); i++) {
            a[i] = s.charAt(i);
        }

        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < (s.length() - 1) / q + 1; j++) {
                if(a[i + j * q] > 0) {
                    sb.append(a[i + j * q]);
                }
                if( i > 0 && i < numRows -1) {
                    if(a[(j + 1) * q - i] > 0) {
                        sb.append(a[(j + 1) * q - i]);
                    }
                }
            }
        }

        return sb.toString();
    }

}
