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
        // char[][] mod = new char[256][needle.length()];
        // for(int i=0; i < needle.length();i++) {
        //     mod[i][needle.charAt(i)] = ;
        // }
        return -1;
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