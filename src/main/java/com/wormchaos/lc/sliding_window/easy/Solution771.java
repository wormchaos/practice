package com.wormchaos.lc.sliding_window.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wormchaos on 2020-01-01.
 */
public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<J.length();i++) {
            set.add(J.charAt(i));
        }
        for(int i=0;i<S.length();i++) {
            if(set.contains(S.charAt(i))){
                count++;
            }
        }
        return count;

    }
}
