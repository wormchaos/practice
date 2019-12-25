package com.wormchaos.lc.sliding_window.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wormchaos on 2019-12-25. 报数
 */
public class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        int count = 1;
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer("");
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() - 1 && c[i] == c[i + 1]) {
                count++;
                i++;
            }
            sb.append(count).append(c[i]);
            count = 1;
            i++;
        }
        return sb.toString();
    }
}
