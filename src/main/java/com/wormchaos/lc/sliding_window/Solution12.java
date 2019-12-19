package com.wormchaos.lc.sliding_window;

/**
 * Created by wormchaos on 2019-12-19.
 * 数字转罗马字
 */
public class Solution12 {

    public String intToRoman(int num) {
        int[] a = new int[]{0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] b = new String[]{"", "I","IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

        StringBuffer sb = new StringBuffer();

        for (int i=a.length - 1; i >0; i--) {
            if(num / a[i] > 0) {
                if(i == a.length - 1) {
                    for (int j = 0; j < num/ a[i];j++) {
                        sb.append(b[i]);
                    }
                    num -= a[i] * (num / a[i]);
                } else {
                    while(num > a[i-1] && num >= a[i]) {
                        sb.append(b[i]);
                        num -= a[i];
                    }
                }
            }
        }
        return sb.toString();
    }
}
