package com.wormchaos.lc.sliding_window;

import com.wormchaos.lc.toolbean.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wormchaos on 2019-12-23 indexOf
 */
public class Solution28 {

    /**
     * KMP
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        char[] c = haystack.toCharArray();
        char[] nc = needle.toCharArray();
        int[] pat = getNext(nc);

        int x = 0;
        int i = 0;
        while (i < haystack.length() && x < needle.length()) {
            if(nc[x] == c[i]) {
                i++;
                x++;
            } else {
                i+= needle.length() - pat[x];
                x = 0;
            }
        }

        return x == needle.length() ?  i -x : -1;
    }

    private int[] getNext(char[] nc) {
        // 对字串生成数
        int[] next = new int[nc.length];
        int x = 0;
        next[0] = 0;
        int i = 1;
        while(i < nc.length -1) {

            if(nc[i] == nc[x]) {
                x++;
                i++;
                // 此时是next位置，而非当前位置，即 1 ~ i-1最大公共pre/end
                next[i] = x;
            } else {
                if(x == 0) {
                    next[i] = 0;
                    i++;
                } else {
                    x = next[x];
                }
            }

        }
        return next;
    }

    /**
     * 最简单的遍历
     * @param haystack
     * @param needle
     * @return
     */
    public int strStrV2(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        char c = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == c) {
                if(haystack.length() - i <= needle.length()) {
                    return -1;
                }
                for(int j=0; j <needle.length();j++) {
                    if(!(haystack.charAt(i + j) == needle.charAt(j))) {
                        break;
                    }
                    if(j == needle.length() - 1) {
                        return i;
                    }
                }
            }

        }
        return -1;
    }

}