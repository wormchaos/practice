package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-1-17.
 */
public class Solution43 {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                result[num2.length() + num1.length() - 2 - i - j] += mul;
            }
        }
        String s = "";
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                int j = i + 1;
                while (j < result.length && result[j] == 0) {
                    j++;
                }
                if (j == result.length) {
                    break;
                } else {
                    for (int k = i; k < j; k++) {
                        s = result[k] + s;
                    }
                    i = j - 1;
                }
            } else {
                if (result[i] >= 10) {
                    result[i + 1] += result[i] / 10;
                    result[i] %= 10;
                }
                s = result[i] + s;
            }
        }
        return s.equals("") ? "0" : s;
    }
}
