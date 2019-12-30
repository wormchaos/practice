package com.wormchaos.lc.sliding_window.easy;


/**
 * Created by wormchaos on 2019-12-29.
 * 最后单词长度
 */
public class Solution572 {
    public int lengthOfLastWord(String s) {
        char[] c = s.toCharArray();
        int l = 0;
        int i = c.length - 1;
        while(i >=0 && c[i] == ' ') {
            i--;
        }
        for(; i >=0; i--) {
            if(c[i] != ' ') {
                l++;
            } else {
                break;
            }
        }
        return l;
    }

}
