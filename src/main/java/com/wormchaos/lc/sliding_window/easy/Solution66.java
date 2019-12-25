package com.wormchaos.lc.sliding_window.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2019-12-25.
 * +1
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        digits[digits.length - 1] += 1;
        for(int i = digits.length - 1; i >=0; i--) {
            if(digits[i] >= 10) {
                if(i == 0) {
                    int[] r = new int[digits.length +1];
                    r[0] = 1;
                    for(int j=1;j < r.length;j++) {
                        r[j] = 0;
                    }
                    return r;
                }
                digits[i-1] += 1;
                digits[i] %= 10;
            } else {
                result[i] = digits[i];
            }

        }
        return result;
    }
}
