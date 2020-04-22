package com.wormchaos.lc.sliding_window.normal;

/**
 * Created by wormchaos on 2020-4-21.
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        return compareVersion(v1, 0, v2, 0);
    }

    private int compareVersion(String[] v1, int p1, String[] v2, int p2) {
        int val1 = 0;
        int val2 = 0;
        if (p1 >= v1.length ) {
            if (p2 >= v2.length) {
                return 0;
            }
        } else {
            val1 = Integer.parseInt(v1[p1++]);
        }
        if (p2 < v2.length) {
            val2 = Integer.parseInt(v2[p2++]);
        }
        if (val1 != val2) {
            return val1 < val2 ? -1 :1;
        }
        return compareVersion(v1, p1, v2, p2);
    }
}
