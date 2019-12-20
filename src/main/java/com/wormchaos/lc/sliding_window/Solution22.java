package com.wormchaos.lc.sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-20.
 * 生产括号
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String>[] c = new List[n + 1];

        if (n == 0) {
            return new ArrayList<>();
        }
        List<String> temp0 = new ArrayList<>();
        temp0.add("");
        c[0] = temp0;

        List<String> temp1 = new ArrayList<>();
        temp1.add("()");
        c[1] = temp1;
        List<String> al;
        for (int i = 2; i < n + 1; i++) {
            al = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String l : c[j]) {
                    for (String r : c[i - j - 1]) {
                        al.add("(" + l + ")" + r);
                    }
                }
            }
            c[i] = al;
        }

        return c[n];
    }

    private List<String> calc(List<String>[] c, int n) {
        if (null != c[n - 1]) {
            return c[n - 1];
        }
        List<String> r = new ArrayList<>();
        if (n == 1) {
            r.add("()");
            return r;
        }
        List<String> s = calc(c, n - 1);
        for (String temp : s) {

            c[n - 1] = r;
        }
        return r;
    }


}
